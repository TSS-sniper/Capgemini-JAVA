package Day35;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writing_in_file {
	public static void main(String[] args) throws IOException {
		File f = new File("Test.txt");
		File f1 = new File("Demo.txt");
		File f2 = new File("NameChanged.txt");
		FileWriter fw = new FileWriter(f);
		f1.renameTo(f2); //takes File type of Object
		fw.write("HEllO");
		fw.close(); //closes the writer
		//fw.flush(); //flushes the stream
	}

}
