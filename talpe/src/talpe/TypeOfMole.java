/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talpe;

/**
 *
 * @author lleshi.alessandro
 */
public enum TypeOfMole {
    GOLDEN(5),
    SILVER(3),
    CLASSIC(1);

    private int pointValue;

    TypeOfMole(int pointValue) {
        this.pointValue = pointValue;
    }

    public int getPointValue() {
        return pointValue;
    }
}
