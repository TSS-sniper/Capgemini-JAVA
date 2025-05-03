package Day35;

import java.io.File;
import java.io.IOException;

public class filehandling_intro {
	public static void main(String[] args) {
		File f = new File("Demo.txt");
		System.out.println(f.exists()); 
		try {
			System.out.println(f.createNewFile()); //true if the file was created successfully, false if the file already exists.
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(f.exists());
		//f.delete();
		//System.out.println(f.exists());
	}

}
