package Day16.String_intro;

public class Stringbuffer {
	
	public static void main(String[] args) {
		StringBuffer str1 =new StringBuffer("abc");
		StringBuffer str2 =new StringBuffer("abc");
		System.out.println(str1.equals(str2)); //gives false as equals is not overridden
	}
}
