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
public class NotifyActivity {
    private boolean hasToyotaActived;
    private Car toyotaCar;
    private Car bmwCar;
    
    public NotifyActivity(){}
    
    public NotifyActivity(boolean hasToyotaActived, Car toyotaCar, Car bmwCar){
        this.hasToyotaActived = hasToyotaActived;
        this.toyotaCar = toyotaCar;
        this.bmwCar = bmwCar;
    }

    public synchronized void runToyota() {
        while (this.hasToyotaActived) {
            try {
                wait();  
            } catch (InterruptedException e) { }
        }
        this.toyotaCar.runMaxSpeed();
        this.hasToyotaActived = true;
        notify();
   }

    public synchronized void runBMW() {
        while (!this.hasToyotaActived) {
            try {
                wait();  
            } catch (InterruptedException e) { }
        }
        this.bmwCar.runMaxSpeed();
        this.hasToyotaActived = false;
        notify();
    }
}
