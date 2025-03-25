package Day7;

import java.util.Scanner;
import java.util.Arrays;

public class array2D_maxcol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int col = sc.nextInt();
		int row = sc.nextInt();
		int [][] arr = new int[row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(Arrays.toString(MaxColm(arr)));
		sc.close();
	}
	
	public static int [] MaxColm(int [][] arr) {
		int [] ans = new int[arr.length];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(max<arr[j][i]) {
					max=arr[j][i];
				}
			}
			ans[i] = max; 
		}
		return ans;
	}

}
