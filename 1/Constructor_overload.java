class casio
{	//constructor output not getting at this moment of learning
	int n1,n2;
	String operation;
	public casio()
	{
		n1=0;
		n2=0;
		operation="nthg";
	}
	public casio(int i)
	{
		n1=i;
		n2=0;
		operation="nthg";
	}
	public casio(int i,int j)
	{
		n1=i;
		n2=j;
		operation="nthg";
	}
	public casio(int i,int j,String op)
	{
		n1=i;
		n2=j;
		operation=op;
	}
}
	//constructor
public class Constructor_overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		casio ob=new casio(5,4);
	}
}
class casio
{	//constructor output not getting at this moment of learning
	int n1,n2;
	String operation;
	public casio()
	{
		n1=0;
		n2=0;
		operation="nthg";
		System.out.print(operation);
	}
	public casio(int i)
	{
		n1=i;
		n2=0;
		operation="nthg";
		System.out.print(n1);
	}
	public casio(int i,int j)
	{
		n1=i;
		n2=j;
		operation="nthg";
		System.out.print(n1+n2);
	}
	public casio(int i,int j,String op)  	// op here is add or sub or multiply
	{
		n1=i;
		n2=j;
		operation=op;
	}
}
	//constructor
public class Constructor_overload {

	public static void main(String[] args) {
		casio ob=new casio();
	}
}
