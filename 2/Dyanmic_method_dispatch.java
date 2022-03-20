class A
{
	public void show()			
	{
		System.out.println("A");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("B");
	}
}
class C extends A
{
	public void show()
	{
		System.out.println("C");
	} 
}
public class Dyanmic_method_dispatch {

	public static void main(String[] args) {
		A obj= new B();		//run time Polymorphism
		obj.show();
		
		obj=new C();		//Dynamic Method Dispatch
		obj.show();

	}

}
