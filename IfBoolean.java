
public class IfBoolean {
	
	public static boolean SoChan(int number) {
		return (number % 2 == 0);
	}
	
	
	public static boolean KiemTra(String name1, String name2) {
		return (name1.equals(name2));
	}
	
	
	public static void main(String[] args) {
		
		
		int number = 9;
		
		if(SoChan(number) == true) {
			System.out.println("day la so chan");
		}else {
			System.out.println("day la so le");
		}
		
		String name1 = "Nguyen";
		String name2 = "Nguyen";
		
		if(KiemTra(name1, name2) == true) {
			System.out.println("trung ten");
		}else {
			System.out.println("khac ten");
		}
		
	}
	
}
