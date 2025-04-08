package Day16.String_intro;

public class intro {
	
	public static void main(String[] args) {
		String str1="Hello";
		str1.concat("HII");
		System.out.println(str1); //gives "Hello" only bcz String is immutable
		//BUT
		//we can change the reference stored by the str1, via creating new string but cant modify that String object
		str1+="Bye";
		System.out.println(str1);
	}

}
