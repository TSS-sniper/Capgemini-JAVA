package Day32;

import java.util.ArrayList;

public class stream_demo {
	
	public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(501);
	list.add(60);
	
	list.stream().filter((element)->element%2==0).forEach((element)->System.out.println(element));
	}
	

}
