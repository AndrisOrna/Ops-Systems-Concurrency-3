package lab5;
import java.util.concurrent.BlockingQueue;


public class ProducerThread  extends Thread {
	BlockingQueue<Integer> buffer;
	public ProducerThread(BlockingQueue<Integer> theBuffer) {
	buffer = theBuffer;
	}
	public void run() {
		try {
		for (int i = 0; i < 20; i++) {
		System.out.println("Producer " + i);
		buffer.put(i*i);
		try {
		sleep((int) (Math.random() * 1000));
		} catch (InterruptedException e) {}
		}
		System.out.println("Producer DONE! ");
		} catch (Exception e) {
		e.printStackTrace();
		}
		}

	}
