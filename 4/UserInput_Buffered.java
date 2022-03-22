import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
public class UserInput {

	public static void main(String[] args)throws Exception
	{
		System.out.println("Enter a number");		//5
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n =Integer.parseInt(br.readLine());
		
		System.out.println(n);

	}

}
*/

public class UserInput_Buffered {

	public static void main(String[] args)throws Exception
	{
		int n=0;
		
		System.out.println("Enter a number");
		
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
		{
				n =Integer.parseInt(br.readLine());		//5
		}
		System.out.println(n);

	}

}


