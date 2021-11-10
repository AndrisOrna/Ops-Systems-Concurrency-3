package lab5_1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void main(String[] args){
    	
    	// Create a new LinkedBlockingQueue size 10 
    	{
    		BlockingQueue<Integer> buffer = new ArrayBlockingQueue<Integer> (10) ;
    		
    		Producer pro = new Producer(buffer, 20);
    		Producer pro1 = new Producer(buffer, 30);
    		Producer pro2 = new Producer(buffer, 40);

    		Consumer con = new Consumer(buffer);

    		//Start Producer and Consumer threads
    		Thread producer = new Thread (pro);
    		Thread producer1 = new Thread (pro1);
    		Thread producer2 = new Thread (pro2);

    		Thread consumer = new Thread(con);
    		
    		
    		producer.start();
    		producer1.start();
    		producer2.start();

    		consumer.start();
//    		Thread consumer = new Consumer(buffer);
//    		consumer.start();
    	}
    }

}
