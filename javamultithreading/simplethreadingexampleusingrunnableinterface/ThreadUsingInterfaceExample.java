/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamultithreading.simplethreadingexampleusingrunnableinterface;

public class ThreadUsingInterfaceExample implements Runnable
{

    @Override
    public void run() {
        System.out.println("Thread Number " + Thread.currentThread().getId() + " is running");
    }
    
}
