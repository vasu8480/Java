public class Prime {
	public static void main(String ... args)
	{
		int n=84;
		boolean prime=true;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if((n%2)==0)
			{
				prime = false;
				break;
			}
			
		}
		if(prime)
			System.out.print(n+"Prime");
		else
			System.out.print(n+" not prime");
	}
		

}
