package Day16.String_intro;

public class case_problem {

	public static void main(String[] args) {
		String st = "Tarun";
		String ans = "";
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch >= 65 && ch <= 96) {
				ans = ans + ch;
			} else {
				ch = (char) (ch - 32);
				ans = ans + ch;
			}
		}
		System.out.println(ans);

	}

}
