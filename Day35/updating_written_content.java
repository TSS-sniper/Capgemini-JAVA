package Day35;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class updating_written_content {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter INPUT:");
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		File f = new File("Test.txt");
		FileWriter fw = new FileWriter(f, true); // gave append as true
		fw.write(ip);
		sc.close();
		fw.close();
	}

}
