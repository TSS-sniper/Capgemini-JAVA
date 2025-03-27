package Day7;

import java.util.Scanner;
import java.util.Arrays;

public class matrix2D_in_out {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] arr = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(arr));
		sc.close();
	}

}
