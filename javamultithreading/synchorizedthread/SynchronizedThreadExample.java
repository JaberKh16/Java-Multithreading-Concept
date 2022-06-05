/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamultithreading.synchorizedthread;

public class SynchronizedThreadExample {
    private static int counter = 0;
    
    public synchronized static  void incrementCounterValue()
    {
        counter++; // incrementing the counter
    }
    
    public static void main(String [] args) throws InterruptedException
    {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i <1000; i++)
                {
                        incrementCounterValue();
                }
            }
        });
        
        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=0; i <1000; i++)
                {
                        incrementCounterValue();
                }
            }
        });
        
        
        // starting both the threads
        thread1.start();
        thread2.start();
        
        // calling the join()
        thread1.join();
        thread2.join();
        
        System.out.println("Counter value: " + counter);
        
    }
}
