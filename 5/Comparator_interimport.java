import java.util.*;
public class Comparator_interimport {

	public static void main(String[] args) {
		List <Integer> values = new ArrayList<>();			// <Integer> only Excepts the Integer Values
		
		values.add(152);
		values.add(45);
		values.add(1);
		values.add(8);
		values.add(946);
		values.add(44);
			/*
		Comparator <Integer> c = new Comparator<Integer>()
				{
						public int compare(i,Integer j)
						{
							return i%10 >j%10 ?1:-1;
						}
				};
				*/ 
			
		Collections.sort(values, (i,j) -> i%10 >j%10 ?1:-1);	
		
		for(Integer j: values)				//List to call objects --- for(Object j: values)
		{
			System.out.println(j);
		}
	}

}
