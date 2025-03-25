package Day6;

public class rev_string {

	public static void main(String[] args) {
		int num=12300;
		int ans=0;
        while(num!=0) {
        	
        	ans=ans*10+num%10;
        	num/=10;
        }
        System.out.println(ans);
	}

}