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
public class Car {
    private int wheels = 4;
    private int doors = 4;
    private int seats = 5;
    private int maxSpeed;
    
    public Car(){}
    
    public Car(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public int getWheels() {
        return this.wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return this.seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }    
    
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println("Max speed = " + getMaxSpeed());
        }
        System.out.println();
    }
    
    public void info(){
        System.out.println("Wheels = " + getWheels() + "\nDoors = " + getDoors() + "\nSeats = " + getSeats()
                + "\nMax speed = " + getMaxSpeed() + "\n");   
    }
}
