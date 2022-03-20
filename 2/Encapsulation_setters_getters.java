// Encapsulation   -- Binding data with methods
class Student
{
	private int roll;
	private String name;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {			//Setters
		this.roll = roll;
	}
	public String getName() {				//Getters
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Encapsulation_setters_getters {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setRoll(498);
		s1.setName("Vasu");
		System.out.println(s1.getRoll());
		System.out.println(s1.getName());
	}

}
