import java.util.HashSet;

class Student{
	private String roll;
	private String name;
	
	
	public Student(String roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return roll;
		
		
	}

	@Override
	public int hashCode() {
		int roll1 = Integer.parseInt(roll);
		return roll1;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) {
			return false;
		}
		Student ob = (Student)obj;
		return ob.roll.equals(this.roll);
	}
	
}
public class HelloWorldDemo {
	public static void main(String[] args) {
		System.out.println("Hello sample");
		HashSet<Student> set = new HashSet<Student>();
		Student st = new Student("35","madhavi");
		Student st1 = new Student("02","Afsar");
		set.add(st);
		set.add(st1);
		Student st2 = new Student("35","madhavi");
		//set.add(st2);
		//System.out.println(set);
		if(set.contains(st2)) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
		
	}
}
