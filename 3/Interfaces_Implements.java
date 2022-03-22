interface writer
{
	void write();
}
class pen implements writer
{
	public void write()
	{
		System.out.println("Im a pen");
	}
}
class pencil implements writer
{
	public void write()
	{
		System.out.println("Im a pencil");
	}
}
class kit
{
	public void d(writer p)
	{
		p.write();
	}
}
public class Interfaces_Implements {

	public static void main(String[] args) {
		kit k=new kit();
		writer p=new pen();
		writer p1=new pencil();
	
		k.d(p1);
	}

}
