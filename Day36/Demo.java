package Day36;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Scanner;

public class Demo {

	@SuppressWarnings("source")
	public static void main(String[] args) throws IOException {
		File f=new File("Demo.csv");
//		f.createNewFile();
		
//      one way to read csv file
//		Scanner sc=new Scanner(f);
//		sc.useDelimiter(",");
//		while(sc.hasNext()) {
//			System.out.println(sc.next());
//		}

		//second way to read file
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null) {
			String [] data =line.split(",");
			for(String s:data) {
				System.out.println(s+"\t");
			}
			line=br.readLine();
		}
		
	}

}