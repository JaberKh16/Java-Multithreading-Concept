/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamultithreading.runnablethreadingexample;

public class ThreadClassExample {
    
    public static void main(String [] agrs) throws InterruptedException
    {
        Thread thread1 = new Thread(new RunnableThread1());
        Thread thread2 = new Thread(new RunnableThread2());
        
        thread1.start();    // starting the 'RunnableThread1'
        thread1.join();    // ensuring the 'RunnableThread1' complete its task done
        thread2.start();  // starting the 'RunnableThread2'
    }
}
