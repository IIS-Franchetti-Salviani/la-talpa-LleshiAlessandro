/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talpe;

/**
 *
 * @author lleshi.alessandro
 */
public class Giocatore {
    private String name;
    private int points;

    public Giocatore(String name) {
        this.name = name;
        this.points = 0;
    }

    public int getPoints() {
        return points;
    }
    public String getName() {
        return name;
    }
    
    public void addPoints(int p) {
        this.points += p;
    }
    public void removePoints(int p) {
        this.points -= p;
        if (this.points < 0) {
            this.points = 0;
        }
    }
}
