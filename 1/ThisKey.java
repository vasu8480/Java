class cla
{	//this Keyword
	int n1,n2=6,res;
	public cla(double n1,int n2)
	{
		this.n1=(int)n1; 
		this.n2=n2;
	}
}	//this Keyword
public class ThisKey {
	public static void main(String[] args) {
		
		cla va=new cla(9.5,8);   //constructor
		System.out.println(va.n2);
		
	}
}
