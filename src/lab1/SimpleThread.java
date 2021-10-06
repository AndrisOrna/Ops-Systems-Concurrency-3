//Create a thread class called SimpleThread by extending the Thread class. This
//thread should receive a string print this string 10 times. Each iteration should last
//1000ms. This thread should also print a message after printing all messages.


package lab1;

public class SimpleThread extends  Thread	
// A thread is a thread of execution in a program. 
//The JavaVirtual Machine allows an application to have multiple threads of execution running concurrently. 
{
	public SimpleThread(String str) // takes in string
	{
		super(str);
	}
	public void run() 
//	'run' thread was constructed using a separate Runnable run object, 
//	then that Runnable object's run method is called;otherwise, this method does nothing and returns. 
	{
		long start =System.currentTimeMillis(); //Returns the current time in milliseconds
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(i + " " + getName());
			try 
			{
				sleep((long)(Math.random() * 1000));
				//sleep(1000);
				//sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {}  // 'InterruptedException e' is Thrown when a thread is waiting, sleeping, 
												//or otherwise occupied,and the thread is interrupted, either before or during the activity.
		}
		long finish = System.currentTimeMillis();
		long timeElapsed= finish - start;
		
		System.out.println("DONE! " + getName()+ " finished in "+ timeElapsed+ " miliseconds");
	}

}
