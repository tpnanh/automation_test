/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Admin
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car toyotaCar = new Toyota();
        toyotaCar.run();
        toyotaCar.info();
        
        Car bmwCar = new BMW();
        bmwCar.run();
    }    
}
