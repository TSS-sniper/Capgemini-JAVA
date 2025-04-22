package Day25.Binary_Search;

public class intro {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,8,24,88};
		int target = 24;
		System.out.println(biny(target,arr));
		System.out.println(binR(target,arr,0,arr.length-1));
	}
	
	public static int biny(int target,int[] arr) {
		int l=0;
		int h=arr.length-1;
		while(l<=h){
			int mid=(l+h)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				h=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return -1;
	}
	public static int binR(int target,int[] arr,int l,int h) {
		int ans=-1;
			int mid=(l+h)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				ans=binR(target,arr,l,mid-1);
			}
			else {
				ans=binR(target,arr,mid+1,h);
			}
		return ans;
	}

}
