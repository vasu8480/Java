import java.util.*;

class Stud implements Comparable<Stud>		///To compare 
{
	int roll,marks;
	String name;
	public Stud(int roll, int marks, String name) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Stud [roll=" + roll + ", marks=" + marks + ", name=" + name + "]";
	}
	
	public int compareTo(Stud s)
	{
		return name.length()>s.name.length()?-1:1;
	}
}

public class Collections_method {
	public static void main(String[] args) {
		List <Stud> Studs = new ArrayList<>();			// <Integer> only Excepts the Integer Values
		
		Studs.add(new Stud(23,78,"vasu"));
		Studs.add(new Stud(83,98,"rav"));
		Studs.add(new Stud(25,71,"shan"));
		Studs.add(new Stud(28,61,"shraddha"));
		Studs.add(new Stud(2,67,"radukanu"));
		
		Collections.sort(Studs ,(i,j)->i.marks>j.marks?1:-1 );		//if you write the ternary operator here you over ride the --- compareTo(Stud s)
	
		for(Stud s:Studs)
		{
			System.out.println(s);
		}
		
	}

}
