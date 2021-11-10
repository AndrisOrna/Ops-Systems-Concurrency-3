package lab5_1;
import java.util.concurrent.BlockingQueue;


public class Producer  extends Thread {
	BlockingQueue<Integer> buffer;
	private int start;
	public Producer(BlockingQueue<Integer> theBuffer, int begining) {
		start = begining;
		buffer = theBuffer;
	}
	public void run (){
		try {
		for (int i = start; i < 20 + start; i++) {
			Thread .sleep(100);
//			queue.put(i);
		System.out.println("Producer puts" + i);
//		System.out.println("[Producer] puts" + i);

		buffer.put(i);
		}
		}
		catch (Exception e) {
			e.printStackTrace();
			}
		}
	}
