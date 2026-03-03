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
    private int x = rdn.nextInt();
    
    public Talpa(int timeOut) {
        this.timeOut = timeOut;
        this.ritorna = timeOut;
    }
    
    private void randomType() {
        int n = rdn.nextInt(3);
        switch (n) {
            case 0 -> type = TypeOfMole.GOLDEN;
            case 1 -> type = TypeOfMole.SILVER;
            default -> type = TypeOfMole.CLASSIC;
        }
        pointValue = type.getPointValue();
    }
    
    
    
    @Override
    public void run() {

        
    }

    
}
