import java.util.Scanner;
public class fibonaci {

	public static void main(String[] args) {
		int k, a=1,b=1;
		k=0;	
		Scanner sc =new Scanner(System.in);	
		System.out.println("regfgv ");
		int n=sc.nextInt();
		System.out.print("1 1 ");
		while(k<=n)
		{
			k=a+b;
			if (k>=n)
					break;
			System.out.print(k+ " ");
			a=b; 
			b=k;
		}
	}

}
