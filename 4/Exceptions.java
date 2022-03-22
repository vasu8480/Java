
public class Exceptions {

	public static void main(String[] args) {
		try 
		{
			int a[]=null;
			a[6]=8;				//Error beacause array index out of Range here
			int i=6,j=0;
			int k=i/j;
			System.out.println("output "+k);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)	//multiple Exceptions in on catch 
		{
			System.err.println("Error");
		}
		
		catch(Exception e)	//multiple Exceptions in on catch 
		{
			System.err.println("Something Wrong");
		}
		
		finally
		{
			System.out.println("Bye");
		}
	}

}
