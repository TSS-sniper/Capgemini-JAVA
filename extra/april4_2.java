package extra;

import java.util.ArrayList;
import java.util.*;

public class april4_2 {
	
	public static void main(String[] args) {
		//ArrayList<Integer> a= new ArrayList<Integer>();
		Integer z[]={2,3,4,45,0,44};
		ArrayList<Integer> b= new ArrayList<Integer>(Arrays.asList(z));
		Scanner sc = new Scanner(System.in);
		//int n =sc.nextInt();
		//a.add(77);
		//System.out.println(a);
//		for (int i = 0; i < n; i++) {
//			a.add(sc.nextInt());
//		}
//		a.remove(0);
//		System.out.println(a);
		
		
		int temp=b.get(5);
		b.remove(5);
		b.add(0,temp);
		b.add(0,55);
		System.out.println(b);
		sc.close();
	}

}
