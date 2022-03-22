class hi extends Thread
{
	public void run()			//Run has to be writeen to achieve multi threading
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}
class hello extends Thread
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
public class Thread_ex {

	public static void main(String[] args) {
		hi obj=new hi();
		hello obj1 =new hello();
		obj.start();
		try {Thread.sleep(5);} catch(Exception e) {}
		obj1.start();
	}
}
