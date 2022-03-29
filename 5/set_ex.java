import java.util.*;
public class set_ex {
	public static void main(String[] args)
	{
		// Set <Integer> Studs = new HashSet<>();		// HashSet values are to in the order -- its will be in random order
		Set <Integer> Studs = new TreeSet<>();
		
		Studs.add(78);				//prints the unique values
		Studs.add(83);
		Studs.add(67);
		Studs.add(25);
		Studs.add(61);
		Studs.add(67);
		
		for(int s:Studs)
		{
			System.out.println(s);
		}
		
	}

}
