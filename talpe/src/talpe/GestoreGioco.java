/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talpe;

import java.util.Random;



/**
 *
 * @author lleshi.alessandro
 */
public class GestoreGioco {
    private Buca[] buche; // ho optato per un array dato che so che la dimensio ne dei buchi è massimo 9
    private Talpa talpa;
    protected Giocatore giocatore;
    private Random rdn;     
    private int bucaAttiva;
    
    public GestoreGioco() {
        buche = new Buca[9];
        for (int i = 0; i < 9; i++) {
            buche[i] = new Buca();
        }
        talpa = new Talpa();
        giocatore = new Giocatore("Player1");
        rdn = new Random();
        bucaAttiva = -1; //nessuna buca attiva all’inizio
    }

    
    public void spawnTalpa() {
        // se c'è già una buca attiva, resetto
        if (bucaAttiva != -1) {
            buche[bucaAttiva].setMole(false);
            talpa.controlEscape();
        }

        bucaAttiva = rdn.nextInt(9);

        // attivo la talpa in quella buca
        buche[bucaAttiva].setMole(true);

        talpa.randomType();
        talpa.appear();
    }
    public void colpisciBuca(int index) {
        if (bucaAttiva == index) {
            if (buche[index].hasMole()) {
                talpa.setHitTrue();
                giocatore.addPoints(talpa.getPointValue());
                buche[index].setMole(false);
                bucaAttiva = -1;
            }
        }

    }
    
    public void cicloTalpa() {
        Thread t = new Thread(() -> {
            while (true) {
                try {
                    spawnTalpa();
                    Thread.sleep(rdn.nextInt(1000, 2001));
                } catch (InterruptedException e) {
                    break;
                }
            }
        });
        t.start();
    }
    
    public void start() {
        bucaAttiva = -1;
        
        cicloTalpa();
    }
    
    public Giocatore getGiocatore() {
        return giocatore;
    }
    public int getBucaAttiva() {
        return bucaAttiva;
    }
    public Talpa getTalpa() {
        return talpa;
    }
    
    
}
