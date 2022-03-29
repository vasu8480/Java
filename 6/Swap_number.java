import java.util.Scanner;

public class Swap_number {
	public static void main(String[] args)
	{
		int a=23;
		int b=56;
		
		/*			This take more bits
		a=a+b;
		b=a-b;
		a=a-b;
		*/
		
		a=a^b;				//XOR Operation reduce the bits
		b=a^b;
		a=a^b;
		
		System.out.println(a);
		System.out.println(b);
	}
}
