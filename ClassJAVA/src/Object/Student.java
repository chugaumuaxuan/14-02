package Object;

public class Student {
	String name;
	int age;
		
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	static {
		Student st3 = new Student("Thang", 22);
	}
	
	void PhuongThuc() {
		Student st4 = new Student("Thanh", 25);
	}
	
	public static void main(String[] args) {
		
	}
}
