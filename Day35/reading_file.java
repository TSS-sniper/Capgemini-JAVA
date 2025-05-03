package Day35;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class reading_file {
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		File f = new File("Demo.txt");
		FileReader fr = new FileReader(f);
		int data= fr.read(); //returns ASCII value of data else if no data to read returns -1
		while(data!=-1) {
			System.out.print((char)data);
			data=fr.read();
		}
		
	}
}
