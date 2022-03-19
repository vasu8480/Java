class cla
{//constructor
	int n1,n2,res;
	public  cla()
	{
		n1=566;
		n2=9;
	}
	public cla(int n)
	{
		n1=n;
		n2=n;
	}
	public cla(double d,int n)
	{
		n1=(int)d;
		n2=n;
	}
}//constructor
public class constructor {
	public static void main(String[] args) {
		
		cla va=new cla(9.5,8);   //constructor
		System.out.println(va.n1);
		
	}
}
