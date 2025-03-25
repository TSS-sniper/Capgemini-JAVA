package Day7;


public class count_element_without_map {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,1,2,3,4,5,1,2,3,4,5,5};
		count(arr);
	}
	
	public static void count(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			int c=1;
			for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==arr[j]) {
				c++;
				arr[j]=Integer.MIN_VALUE;
			}
			}
			if(arr[i]!=Integer.MIN_VALUE){
				System.out.println(arr[i]+": "+c+" times");
		}
	}

}}
