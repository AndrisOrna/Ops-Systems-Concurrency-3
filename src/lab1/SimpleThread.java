//Create a thread class called SimpleThread by extending the Thread class. This
//thread should receive a string print this string 10 times. Each iteration should last
//1000ms. This thread should also print a message after printing all messages.


package lab1;

public class SimpleThread extends  Thread{
	public SimpleThread(String str) {
		super(str);
	}
	public void run() {
		long start =System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + getName());
			try {
				sleep((long)(Math.random() * 1000));
				//sleep(1000);
				//sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {}
		}
		long finish = System.currentTimeMillis();
		long timeElapsed= finish - start;
		System.out.println("DONE! " + getName()+ " finished in "+ timeElapsed+ " miliseconds");
	}

}
