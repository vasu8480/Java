 class counter
 {
	 int count;
	 public synchronized void increment()			// one thread works entirlry till the last value 
	 {
		 count++;
	 }
 }
public class synchornized {

	public static void main(String[] args)throws Exception 
	{
		counter c= new counter();
		Thread t1=new Thread(new Runnable()
				{
				public void run()
				{
						for(int i=0;i<1000;i++)
						{
							c.increment();	
						}
				}
			});
		Thread t2=new Thread(new Runnable()
					{
					public void run()
					{
							for(int i=0;i<1000;i++)
							{
								c.increment();	
							}
					}
				});
		t1.start();
		t2.start();
		
		t2.join();
		t1.join();
		System.out.println("Count "+c.count);
	}

}
