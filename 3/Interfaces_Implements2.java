							//Anonymous Class in Class EXamples
/*
class AS
{
	public void show()
	{
		System.out.println("A");
	}
	
}
public class Interfaces_Implements2 {

	public static void main(String[] args) {
		AS obj =new AS()
				{
					public void show()
					{
						System.out.println("Anonymous");
					}
				};
		obj.show();
	}

}
*/

						//Anonymous Class in Interface EXamples

interface AS
{
	void show();
}
public class Interfaces_Implements2 {

	public static void main(String[] args) {
		AS obj =new AS()
				{
					public void show()
					{
						System.out.println("Anonymous");
					}
				};
		obj.show();
	}

}