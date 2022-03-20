class A
{
	int i=4;
	public void show()			//Show() same name in BB Class to -- soo its method overloading
	{
		System.out.println("A");
		System.out.println(i);
		System.out.println(" ");
	}
}
class B extends A
{
	int i=8;
	public void show()
	{
		super.i=5;
		super.show();
		System.out.println("B");
		System.out.println(i);
		System.out.println(" ");
	}
	
}
public class Method_Overriding {

	public static void main(String[] args) {
		B obj= new B();
		obj.show();

	}

}
