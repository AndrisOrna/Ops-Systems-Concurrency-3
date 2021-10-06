//Create a testing class for SimpleThreadRunnable which will receive the following
//strings:
//new SimpleThread(“Dog”).start();
//new SimpleThread(“Cat”).start();
//new SimpleThread(“Fish”).start();


package lab1;

public class TestingSimpleThreadRunnable {
	public static void main (String[] args) {
		new SimpleThread("Dog").start();
		new SimpleThread("Cat").start();
		new SimpleThread("Fish").start();

	}
}
