package lab5_1;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	
	protected BlockingQueue<Integer> queue = null;
	public Consumer(BlockingQueue<Integer> queue) {
	this.queue = queue;
	}
	public void run() {
		try {
			while(true) {
				process(queue.poll()); // can change poll to take
			}
				
				
		
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	private void process(Integer take) throws InterruptedException{
		System.out.println("[Consumer] take: " + take );
		Thread.sleep(300);
	}
	
}



	



