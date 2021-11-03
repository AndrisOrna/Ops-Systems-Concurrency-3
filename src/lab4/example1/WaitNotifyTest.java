package lab4.example1;

/*Implement two threads called Waiter and Notifier and a WaitNotifyTest class. 
Waiter thread should block the monitor until it is released by the Notify thread. Use the starting code in Week5_os example1. 
The Waiter thread should use a synchronized method and a wait() method for the message, 
and print a message. 
(name + “waiting to get notified at time” + System.currentTimeMillis()) 
This prints the thread name and system time in UNIX timestamp. 
The Notifier thread should sleep for 1000ms and then send a notify(). 
Use the methods msg.notify() and msg.notifyAll() and note the difference.*/

import lab1.RunnableImplemented;

public class WaitNotifyTest {

    public static void main(String[] args) {
        // Create a Message(), two Waiters(msg), and a Notifier(msg)
    	// create three threads
    	
 ///////////// Create a Message()//////////////
    	Message msg1 = new Message("msg1");
    	
//////////////Create Waiters/////////////
    	// 1st for waiter
    	Waiter waiter1 = new Waiter(msg1);
    	
    	// 2nd for waiter
    	Waiter waiter2 = new Waiter(msg1);

///////////Create Notifier//////////
    	//3rd notifier
    	Notifier notifier2 = new Notifier(msg1);
    	
//////////Create Threads///////////////
    	//Start all of the threads
    	Thread thread1 = new Thread (waiter1, "Waiter 1");
    	Thread thread2 = new Thread (waiter2, "Waiter 2");
    	Thread thread3 = new Thread (notifier2, "Notifier 3");
    	
    	// start the threads
    	// Print message "All the threads are started"
    	 thread1.start();
    	 thread2.start();
    	 thread3.start();
    }
}



