/*
 * Mulit-Threading is an example of working with multiple threads.
 * Threads can be created using 2 ways:
        
        1) Implementing Runnable Interface
        2) Extending Thread Class
 */
package javamultithreading.simplethreadingexampleusingrunnableinterface;


public class ThreadExampleWithRunnable {
    public static void main(String [] args)
    {
        int numberOfThreads = 6;
        
        for(int i=0;  i <=numberOfThreads; i++)
        {
            Thread thread = new Thread(new ThreadUsingInterfaceExample());
            thread.start();
        }
        
    }
}
