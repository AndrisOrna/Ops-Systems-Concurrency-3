package lab1;

public class SimpleThreadNotRunnable {
	
	public static void main (String[] args) {
	new SimpleThread("Dog").start();
	new SimpleThread("Cat").start();
	new SimpleThread("Fish").start();
	}
}
