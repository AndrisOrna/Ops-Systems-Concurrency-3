package lab1;

public class RunnableImplemented implements Runnable{
	String name;
	
	public RunnableImplemented(String name) {
		
		this.name = name ;
		}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		{
			long start =System.currentTimeMillis(); //Returns the current time in milliseconds
			for (int i = 0; i < 5; i++) 
			{
				System.out.println(i + " " + name);
				try 
				{
					Thread.sleep((long)(Math.random() * 500));
					//sleep(1000);
					//sleep((int)(Math.random() * 1000));
				} catch (InterruptedException e) {}  // 'InterruptedException e' is Thrown when a thread is waiting, sleeping, 
													//or otherwise occupied,and the thread is interrupted, either before or during the activity.
			}
			long finish = System.currentTimeMillis();
			long timeElapsed= finish - start;
			
			System.out.println("DONE! " + name+ " finished in "+ timeElapsed+ " miliseconds");
		}
	}


}
