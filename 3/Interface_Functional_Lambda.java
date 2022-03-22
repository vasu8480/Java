
/*
interface AS
{
	void show();
}
public class Interface_Functional_Lambda {
	public static void main(String[] args) {
		AS obj =() -> System.out.println("Anonymous");
			obj.show();
	}
}
*/
@FunctionalInterface
interface demo
{
	void abc();
	default public void show()
	{
		System.out.print("in show");
	}
}
class demimp implements demo
{
	public void abc()
	{
		System.out.println("in abc");
	}
//	public void show()						//this will over ride the show() in A class
//	{
//		System.out.print("in new show"); 
//	}
}
public class Interface_Functional_Lambda {
	public static void main(String[] args) {
		demo obj=new demimp();
		obj.abc();
			obj.show();
	}
}