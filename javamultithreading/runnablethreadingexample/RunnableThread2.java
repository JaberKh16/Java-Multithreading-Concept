/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamultithreading.runnablethreadingexample;

public class RunnableThread2 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i < 10; i++)
        {
            System.out.println("Thread Name = " +Thread.currentThread().getName() + "running value is : " + i);
        }
    }
    
}
