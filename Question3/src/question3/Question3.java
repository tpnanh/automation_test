/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
    The order of outputs in 2 and 1 different because 2 works are doing 
    * on different threads which is called multi-threading
    * This allows to implement 2 or more tasks at the same time to faster overall execution
        
    To make sure that order will run sequentially, we can use Single Thread Executor (an ExecutorService method)
    * so that there is only 1 thread in ThreadPool and tasks will be executed orderly
 */
public class Question3 {
    /** 
     *  @param args
    **/
  
    public static void main(String[] args) {  
        ExecutorService executor = Executors.newSingleThreadExecutor();
        
        Car toyotaCar = new Toyota();    
        Car bmwCar = new BMW();  

        Thread toyotaObject = new Thread(toyotaCar);
        Thread bmwObject = new Thread(bmwCar);   
        
        executor.submit(toyotaObject);
        executor.submit(bmwObject);  
        executor.shutdown();
    }    
}
