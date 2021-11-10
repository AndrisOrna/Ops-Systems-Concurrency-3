package lab5;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void main(String[] args){
    	
    	// Create a new LinkedBlockingQueue size 10 
    	{
    		BlockingQueue<Integer> buffer =
    		new ArrayBlockingQueue<Integer> (10) ;
    		
    		//Start Producer and Consumer threads
    		Thread p = new ProducerThread(buffer);
    		p.start();
//    		Thread c = new ConsumerThread(buffer);
//    		c.start();
    	}
    }

}
