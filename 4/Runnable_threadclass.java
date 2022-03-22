class hi implements Runnable
{
	public void run()			//Run has to be written to achieve multi threading
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}
class hello implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}
public class Runnable_threadclass {

	public static void main(String[] args) {
		Runnable obj=new hi();
		Runnable obj1 =new hello();
		
		Thread t1=new Thread(obj);			//Thread objects
		Thread t2=new Thread(obj1);
		
		t1.start();
		try {Thread.sleep(5);} catch(Exception e) {}
		t2.start();
	}
}
