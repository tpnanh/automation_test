/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author Admin
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car toyotaCar = new Toyota();
        
        Car bmwCar = new BMW();

        Thread toyotaObject = new Thread(toyotaCar);
        toyotaObject.start();
        
        Thread bmwObject = new Thread(bmwCar);
        bmwObject.start();
    }
    
}
