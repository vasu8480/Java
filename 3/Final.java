final class A		//final used so no one extends this class
{
	final int i;		//final used so no one extends this variable
	final public A()	//final used so no one extends this methods
	{
		i=4040;
	}
}
class B extends A			//will get error here
{
	final public A()	//will get error here 
	{
		i=4040;				//will get error here
	}
}
public class Final {

	public static void main(String[] args) {
		A obj=new A();
		System.out.println(obj.i);
	}

}
