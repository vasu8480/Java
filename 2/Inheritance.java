class cal					//Super class,Parent,Base
{
	public int add(int i,int j)
	{
		return i+j;
	}
}

class calad extends cal			//Single-Level, Sub class,Child,Derived
{
	public int sub(int i, int j)
	{
		return i-j;
	}
}
class calvad extends calad		//multi-Level Inheritance
{
	public int mul(int i, int j)
	{
		return i*j;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		calvad c1 =new calvad();
		int res =c1.add(5,4);
		int res1 =c1.sub(5,4);
		int res2 =c1.mul(5,4);
		
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
	}

}
