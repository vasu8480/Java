class clac
{
	int n1,n2,res;
	public void perform()
	{
		res=n1+n2;
	}
}
public class class_and_object {
	public static void main(String args[])
	{
		clac va=new clac();
		va.n1=4;
		va.n2=5;
		va.perform();
		System.out.println(va.res);
	}
}
