package Day17.Exception;

//import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Checked Exception:
// (1) Exception Declaration
// (2) Exception Handling

public class checked_exception {
	
	public static void main(String[] args) {  //exception is handled here
		m1();
	}
	
	public static void m1() {
		try {
			m2();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	public static void m2() throws FileNotFoundException {
		//FileInputStream fileInputStream = new FileInputStream("file.txt");  //exception is declared and not solved/handled
	}
	

}
