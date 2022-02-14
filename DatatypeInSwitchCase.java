
public class DatatypeInSwitchCase {
		
	public static void main(String[] args) {
		
				
		int i = 2;
		switch(i) {
		case 2: System.out.println("day la thu hai");
		break;
		}
		
		switch(Integer.valueOf(i)) {
		case 2: System.out.println("day la thu hai");
		break;
		}
	
		char a = 2;
		switch(a) {
		case 2: System.out.println("day la thu hai");
		break;
		}
		
		switch(Character.valueOf(a)) {
		case 2: System.out.println("day la thu hai");
		break;
		}
		
		byte b = 2;
		switch(b) {
		case 2: System.out.println("day la thu hai");
		break;
		}
		
		switch(Byte.valueOf(b)) {
		case 2: System.out.println("day la thu hai");
		break;
		}
		
		short c = 2;
		switch(c) {
		case 2: System.out.println("day la thu hai");
		}
		
		switch(Short.valueOf(c)) {
		case 2: System.out.println("day la thu hai");
		break;
		}
		
		String name = "anh";
		switch(name) {
		case "anh": System.out.println("ten la anh");
		}
		
		
		
	}
}
