class emp
{	//Static Keyword
	int eid,salary;
	static String ceo;
	static
	{
		ceo="Vasu";
		System.out.println("in static");
	}
	public emp()
	{
		eid=1;
		salary=3450;
		System.out.println("in contructor");
	}
	public void show()
	{
		System.out.println(eid+ " "+ salary+ " " +ceo);
	}
}//Static Keyword

public class Static_Key {
	static int i=0;				//static variable i 
	public static void main(String[] args) {
		i=9;					//to access this i u need to define i as static keyword
		emp rav =new emp();
		emp rah=new emp();
		rav.show();
		rah.show();
	}

}
