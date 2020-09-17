/*****
 ** Thread Example
 **
 **
 **
 */


import java.io.*;
import java.util.*;

public class threadTest{

    public static void main(final String[] args) {

		// Create a new thread
		simpleThreadClass mythread1;
		simpleThreadClass mythread2;

		mythread1 = new simpleThreadClass(0);
		mythread2 = new simpleThreadClass(1);
		final Thread mythread3 = new Thread(new simpleRunnable("R1"));

		final int i = 4;
		final Thread mythread4 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread " + i + " is running");
			}
		});

		// Run the thread
		mythread1.start();

		mythread2.start();
		mythread3.start();
		mythread4.start();

		// main thread continues
		try {
			int sleeptime = (int) (15 * Math.random());
			Thread.sleep(2000 * sleeptime);

			// use depreciate method
			// mythread3.stop();

			// use deferred cancellation

		} catch (InterruptedException e) {
		}


	    System.out.println(Thread.currentThread());



    }

}
