interface demo1
{
	void abc();
	default  void show()
	{
		System.out.print("in show");
	}
}
interface mydemo
{
	default  void show()
	{
		System.out.print("in myshow");
	}
}
class demimp1 implements demo1,mydemo			//Multiple Inheritance
{
	public void abc()
	{
		System.out.println("in abc");
	}
	
@Override
	public void show() {
		mydemo.super.show();
	}
}
public class Multiple_inheritance_Interface {
	public static void main(String[] args) {
		demo1 obj=new demimp1();
		obj.abc();
		obj.show();
	}
}