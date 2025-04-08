package Day16.String_intro;

public class lastIndex {

	public static void main(String[] args) {
		String name = "Tarun Sheoran";
		System.out.println(LastIndexOf(name, 'a'));
	}

	public static int LastIndexOf(String str, char ch) {
		int ans = -1;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (ch == str.charAt(i)) {
				ans = i;
				break;
			}
		}
		return ans;
	}

}
