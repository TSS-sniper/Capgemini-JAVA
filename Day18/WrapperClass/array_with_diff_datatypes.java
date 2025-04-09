package Day18.WrapperClass;

import java.util.Arrays;

public class array_with_diff_datatypes {
	public static void main(String[] args) {
		Object[] arr = new Object[5]; //array with diff. datatypes but still homogeneous as all these are object
		arr[0] = 10;
		arr[1] = false;
		arr[2] = 10.21;
		arr[3] = "String";
		arr[4] = 's';
		System.out.println(Arrays.toString(arr));
		String s=(String)arr[3];
		System.out.println(s.length());

	}
}
