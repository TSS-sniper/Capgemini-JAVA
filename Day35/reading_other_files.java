package Day35;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class reading_other_files {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\Users\\tarun\\Desktop\\JAVA Workspace\\Capgemini_Java_Training\\src\\Day23\\HashMap\\hashmap.java");
		Scanner sc = new Scanner(f);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}
