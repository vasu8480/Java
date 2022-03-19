class casio
{
	// method overloading
	public void add(int i,int j)  // method overloading
	{
		System.out.println(i+j);
	}
	public void add(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}
	// method overloading
}
public class Method_overload {

	public static void main(String[] args) {
		casio ob=new casio();
		ob.add(54, 456);
	}
}
