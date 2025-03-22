package Day5;
import java.util.Scanner;

public class hasNext {
	public static void main(String[] args) {
				String str="10 20 30";
				Scanner ip=new Scanner(str);
				ip.useDelimiter(":");
				System.out.println(ip.next());
				System.out.println(ip.hasNext());
				System.out.println(ip.next());
				System.out.println(ip.hasNext());
				System.out.println(ip.next());
				System.out.println(ip.hasNext());
				ip.close();
				
		}
}
