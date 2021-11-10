package lab5Example;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import lab5.ConsumerThread;
import lab5.ProducerThread;

public class WaitNotifyTest {

    public static void main(String[] args) {
        // Create a Message(), two Waiters(msg), and a Notifier(msg)
    	//Start Waiters and Notifier
    	// Print message "All the threads are started"
    	BlockingQueue<Integer> buffer =
    			new ArrayBlockingQueue<Integer> (10) ;
    			Thread p = new ProducerThread(buffer);
    			p.start();
//    			Thread c = new ConsumerThread(buffer);
//    			c.start();
    
    }

}
