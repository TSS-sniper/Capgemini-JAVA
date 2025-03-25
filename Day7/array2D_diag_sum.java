package Day7;

import java.util.Scanner;

public class array2D_diag_sum {
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
		System.out.println(diagSum(arr));
		sc.close();
	}
	
	public static int diagSum(int [][] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length ; j++) {
				if(i==j) {
					sum+=arr[i][j];
				}
			}
		}
		
		return sum;
	}
	

}
