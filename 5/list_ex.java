import java.util.*;

public class list_ex {

	public static void main(String[] args) {
		List <Integer> values = new ArrayList<>();			// <Integer> only Excepts the Integer Values
		
		values.add(5);
		values.add(45);
		values.add(1);
		values.add(8);
		values.add(94);
		values.add(445);
	//	values.add(5, "vfds");			
		Iterator it=values.iterator();
		
		/*
		for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i));
		}
		*/
		
		Collections.sort(values);
		Collections.reverse(values);	
		
		for(Integer j: values)				//List to call objects --- for(Object j: values)
		{
			System.out.println(j);
		}
	}

}
