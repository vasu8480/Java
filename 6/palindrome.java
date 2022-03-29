import java.util.Scanner;

public class palindrome {

	public static void main(String[] args)
	{
			int n,r=0,j;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter");
			int k = sc.nextInt();
			j=k;
			while(k>0)
			{
				n=k%10;
				k=k/10;
				r=r*10+n;
			}
			if(j==r)
				System.out.print("palo");
			else
				System.out.print("no");
	}
}
