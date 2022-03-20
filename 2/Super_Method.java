class A
{
	public A()
	{
		System.out.println("in A");
	}
	public A(int i)
	{
		System.out.println("A in i ");
	}
	
}
class B extends A 
{
	public B()
	{
		super();              // want to call A(int i) need to pass --- super(5 or any number)
		System.out.println("in B");
	}
	public B(int i)
	{
		super(i);
		System.out.println("B in i ");
	}
}
public class Super_Method {

	public static void main(String[] args) {
		B obj=new B(); 
		B obj1=new B(5);
		
		
	}

}
