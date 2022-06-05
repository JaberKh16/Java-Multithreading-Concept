/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamultithreading.synchorizedthread;

class Processor
{
    
    // Though both method are 'synchronized; they are locked on the same class which is 'Processor'
    public synchronized void waitingMethod()
    {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName() + " is releasing the lock and going to wait.....");
        
        try 
        {
            t1.wait();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        
        // this is where the Thread will be continued when the notify() is called
        System.out.println(t1.getName() + " get the object lock back and continue its execution");
    }
    
    
    
    public synchronized void sleepingMethod()
    {
        Thread t1 = Thread.currentThread();
        
        try 
        {
            Thread.sleep(300); // sleep for 300 ms
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        
        notify(); // notifying the thread
        
        System.out.println("A Thread which is waiting for lock of this object is notified by " + t1.getName());
    }
}

    


public class SynchornizedProcessorWorkingExample {
    
    public static void main(String [] args)
    {
        Processor processor = new Processor();
        
        // Creating two different threads
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run() {
                processor.waitingMethod();
            }
        });
        
        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run() {
                processor.sleepingMethod();
            }
        });
        
        
        thread1.start();
        thread2.start();
    }
}
