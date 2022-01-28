/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Admin
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Car toyotaCar = new Toyota();    
        Car bmwCar = new BMW();  
        NotifyActivity notify = new NotifyActivity(false,toyotaCar,bmwCar);

        Thread toyotaObject = new Thread(toyotaCar){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++){
                    notify.runToyota();
                }
            }
        };   
        
        Thread bmwObject = new Thread(bmwCar){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++){
                    notify.runBMW();
                }
           }
        }; 
        
        toyotaObject.start();
        bmwObject.start();
    }    
}
