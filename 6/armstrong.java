import java.util.Scanner;

public class armstrong {
	public static boolean isPerfect(int n)
	{
		int sum=0,i,j=0,k=n;
		while(k>0)
		{
			i=k%10;
			sum+=i*i*i;
			k/=10;
		}
		if(sum==n)
			return true;
		return false;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int k = sc.nextInt();

			boolean b=isPerfect(k);
			if(b)
				System.out.print("armstrong");
			else
				System.out.print("not armstrong");
	}
		

}
