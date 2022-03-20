class Cal
{
	public int add(int ... n)  //varaible length arguments (u can pass many values)...
	{
		int sum=0;
		for( int i:n)
		{
			sum+=i;
		}
		return sum;
	}
}
public class Varargs {

	public static void main(String[] args) {
		Cal obj =new Cal();
		System.out.println(obj.add(4,5));
	}

}
