package Day35;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class reading_file_Scanner {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("Demo.txt");
		Scanner sc  = new Scanner(f);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}
