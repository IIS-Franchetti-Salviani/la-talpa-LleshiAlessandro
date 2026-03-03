/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talpe;

import java.time.LocalTime;

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

    public Talpa(int timeOut) {
        this.timeOut = timeOut;
        this.ritorna = timeOut;
    }
    
    public void randomTypeMole(){
        
        
        switch (type) {
            case GOLDEN:
                this.pointValue = 5;
                break;
            case SILVER:
                this.pointValue = 3;
                break;
            default:
                this.pointValue = 1;
                break;
        }
    }
    
    
    @Override
    public void run(){
        
    }
    
}
