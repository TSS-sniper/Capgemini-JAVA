package Day17.Exception;

//import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exception_obj_propagation {

	public static void main(String[] args) throws FileNotFoundException{
		m1();
	}

	public static void m1() throws FileNotFoundException {
		m2();
	}

	public static void m2() throws FileNotFoundException {
		//FileInputStream fileInputStream = new FileInputStream("file.txt"); // exception is declared and not
																			// solved/handled
	}

}


// throws propagates the exception object...