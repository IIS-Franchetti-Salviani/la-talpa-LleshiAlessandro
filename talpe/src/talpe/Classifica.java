/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talpe;

import java.util.ArrayList;

/**
 *
 * @author lleshi.alessandro
 */
public class Classifica {

    private ArrayList<Giocatore> giocatori;

    public Classifica() {
        giocatori = new ArrayList<>();
    }

    //aggiungo o aggiorno la classifica
    public void aggiorna(Giocatore g) {
        boolean trovato = false;

        // Cerco se il giocatore esiste già
        for (int i = 0; i < giocatori.size(); i++) {
            if (giocatori.get(i).getName().equals(g.getName())) {
                // Aggiorno i punti del giocatore esistente
                giocatori.get(i).addPoints(g.getPoints());
                trovato = true;
                break;
            }
        }

        //se non lo troovo lo aggiungo
        if (!trovato) {
            giocatori.add(g);
        }

        for (int i = 0; i < giocatori.size(); i++) {
            for (int j = i + 1; j < giocatori.size(); j++) {
                if (giocatori.get(j).getPoints() > giocatori.get(i).getPoints()) {
                    // scambio i due giocatori
                    Giocatore temp = giocatori.get(i);
                    giocatori.set(i, giocatori.get(j));
                    giocatori.set(j, temp);
                }
            }
        }
    }
    public void stampa() {
    System.out.println("CLASSIFICA");
    for (int i = 0; i < giocatori.size(); i++) {
        Giocatore g = giocatori.get(i);
        System.out.println((i + 1) + ". " + g.getName() + " - " + g.getPoints() + " punti");
    }
    System.out.println();
    }
}
