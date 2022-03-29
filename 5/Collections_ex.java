import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Collections_ex {

	public static void main(String[] args) {
		Collection values = new ArrayList();
		for(int i=1;i<=6;i++)
		{
			values.add(i);	
		}
		Iterator it=values.iterator();
		
		System.out.println(values);
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
