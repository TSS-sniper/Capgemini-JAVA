package Day32;

import java.util.ArrayList;

public class stream_demo2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(21);
		list.add(30);
		list.add(40);
		list.add(501);
		list.add(60);
		
		list.stream().filter((element)->{
			//System.out.println("Filter");
			if(element%2!=0) { System.out.println("Filter Not Passed"); return false;}
			else 
				return element%2==0;
			}).forEach(e->System.out.println(e));
	}

}
