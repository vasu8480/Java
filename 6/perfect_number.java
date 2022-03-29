import java.util.Scanner;

public class perfect_number {
	public static boolean isPerfect(int k)
	{
		int sum=0;
		for(int i=1;i<=k;i++)
		{
			if((k%i)==0)
				sum+=i;
		}
		if(k==sum)
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
				System.out.print("perfect");
			else
				System.out.print("not perfect");
	}
		

}
