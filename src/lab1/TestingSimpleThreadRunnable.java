//Create a testing class for SimpleThreadRunnable which will receive the following
//strings:
//new SimpleThread(“Dog”).start();
//new SimpleThread(“Cat”).start();
//new SimpleThread(“Fish”).start();

package lab1;

public class TestingSimpleThreadRunnable 
{
	public static void main (String[] args) 
	{
		
		Runnable s1 = new RunnableImplemented("Turtle") ;
		Thread t1 = new Thread(s1) ;
		t1.start();
		
//		Runnable turtle = new Thread(turtle);

	}
}
