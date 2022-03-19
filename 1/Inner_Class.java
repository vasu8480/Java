/*
 * inner class
 * 		member class
 * 		static class
 * 		annonymous class
 */


class Outer
{
	static int a;
	public static void show()
	{
		
	}
	static class Inner
	{
		public void display()
		{
			System.out.println("display the content");
		}
	}
}
public class Inner_Class {

	public static void main(String[] args) {
		Outer obj =new Outer();
		obj.show();
//		Outer.Inner obj1=obj.new Inner();    if Inner class is not static
//		obj1.display();
		Outer.Inner obj1=new Outer.Inner();  // if static we mentioned above as static  
		obj1.display();
		
	}

}
