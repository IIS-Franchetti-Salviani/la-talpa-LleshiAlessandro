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
public class Talpa implements Runnable{
    private int pointValue;
    private boolean hit;
    private int timeOut;
    private TypeOfMole type;
    private int ritorna;
    private Thread t = new Thread();
    
    
    private Random rdn = new Random();
    
    public Talpa() {
        this.hit = false;
        randomType(); // inizializza con tipo casuale
    }
    
    private void randomType(){
        int n = rdn.nextInt(3);
        switch (n) {
            case 0 -> type = TypeOfMole.GOLDEN;
            case 1 -> type = TypeOfMole.SILVER;
            default -> type = TypeOfMole.CLASSIC;
        }
        pointValue = type.getPointValue();
    }
    
    public TypeOfMole getType(){
        return type;
    }
    public int getPointValue(){
        return pointValue;
    }
    
    

    
    //tutte le casistiche della talpa
    public void appeare(){
    hit = false;
    //la talpa è uscita
}
    public void setHitTrue(){
        if (!hit) {
            hit = true;
            //la talpa è stata colpita
        }
    }
    public void controlEscape(){
        if (!hit) {
            //la talpa non è stata colpita :(((((
        }
    }
    public boolean isHit(){
        return hit;
    }
    
    @Override
    public void run() {
    while (!Thread.currentThread().isInterrupted()){
        try {
                randomType();
                appeare();
                Thread.sleep(2000);
                controlEscape();      
                Thread.sleep(1000);
            }
        catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
