
public class Wrapper_Class_demo {

	public static void main(String[] args) {
		int i  =3;		//Primitive Datatype
		

		Integer ii=new Integer(i);	/*Boxing   or Wrapping --- This is slower than primitive but in hibernate and Api correction 
									we will use wrapper*/
		
		int j =ii.intValue();		//Unboxing   --Unwrapping
		
		Integer value=i;			//AutoBoxing and Auto Wrapping
		
		int k=value;				//AutoUnBoxing  
		
		
		String s1="123";
		int n =Integer.parseInt(s1);		//parseint
		System.out.print(n);
	}

}
