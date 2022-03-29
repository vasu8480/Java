import java.util.*;
public class Map_inter {

	public static void main(String[] args) {
	
		//Map<String,String> map=new HashMap<>();		
		Map<String,String> map=new Hashtable<>();		//for thread safety
		map.put("MyName","vasu");
		map.put("action", "Shraddha");
		map.put("Ceo", "Sundar");
		
		Set<String> keys =map.keySet();
		
		for(String key:keys)
		{
			System.out.println(key+ " : "+map.get(key));
		}

	}

}
