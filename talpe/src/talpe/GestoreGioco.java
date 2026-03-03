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
    private Giocatore giocatore;
    private Classifica classifica;
    private Random rdn;     
    private int bucaAttiva;
    
    public GestoreGioco() {
        buche = new Buca[9];
        for (int i = 0; i < 9; i++) {
            buche[i] = new Buca();
        }
        talpa = new Talpa();
        giocatore = new Giocatore("Player1");
        classifica = new Classifica();
        rdn = new Random();
        bucaAttiva = -1; //nessuna buca attiva all’inizio
    }
    
    
    public void spawnTalpa() {
        // se c'è già una buca attiva, resetto
        if (bucaAttiva != -1) {
            buche[bucaAttiva].setMole(false);//"attivo" la talpa in questa buca
            talpa.controlEscape();
        }

        bucaAttiva = rdn.nextInt(9);

        // attivo la talpa in quella buca
        buche[bucaAttiva].setMole(true);

        talpa.randomType();
        talpa.appear();
    }
}
