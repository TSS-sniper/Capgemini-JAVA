package extra;

import java.util.*;

public class april4_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int [] arr=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		MinMax(n,arr);
		sc.close();
	}
	
	public static void MinMax(int n, int [] arr) {
		int [] ans=new int[n];
		int i=0;
		int j=n-1;
		int k=0;
		
		if(n%2==1) {
			ans[n-1]=arr[n/2];
		}
		while(i<j) {
			ans[k]=arr[i];
			ans[k+1]=arr[j];
			i++;
			j--;
			k+=2;
		}
		System.out.println(Arrays.toString(ans));
	}

}
