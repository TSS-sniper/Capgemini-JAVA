package Day16.String_intro;

public class replace {

	public static void main(String[] args) {
		String name = "Tarun Sheoran";
		System.out.println(myreplace(name, 'a', 'x'));
	}

	public static String myreplace(String str, char ch1, char ch2) {
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == ch1) {
				ans += ch2;
			} else {
				ans += c;
			}

		}
		return ans;

	}

}
