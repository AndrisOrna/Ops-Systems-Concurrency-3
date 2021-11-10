package lab5Example;

import java.util.concurrent.BlockingQueue;

public class ConsumerThread implements Runnable {
	

	protected BlockingQueue<String> queue = null;
	public ConsumerThread(BlockingQueue<String> queue) {
	this.queue = queue;
	}
	public void run() {
	try {
	System.out.println(queue.take());
	System.out.println(queue.take());
	System.out.println(queue.take());
	} catch (InterruptedException e) {
	e.printStackTrace();
	}
	}
{
}
}
