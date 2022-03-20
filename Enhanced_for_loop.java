public class Enhanced_for_loop {
	static int i;
	public static void main(String[] args) {
		int a[]={1,3,4,7};

		//print all elements in array		
//		for(i=0;i<4;i++)
//		{
//			System.out.println(a[i]);
//		}
			//Enhanced For Loop	
		for(int j: a)
		{
			System.out.print(" "+j);
		}
	}
}
