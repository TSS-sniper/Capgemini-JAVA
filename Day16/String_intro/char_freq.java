package Day16.String_intro;

public class char_freq {
	public static void main(String[] args) {
		String s = "abacbcg";
		System.out.println(check(s));
	}

	public static boolean check(String s) {
		int[] alpha = new int[26];
		for (int i = 0; i < s.length(); i++) {
			alpha[(int) (s.charAt(i) - 97)]++;
		}
		int f = 0;
		for (int i : alpha) {
			if (i != 0) {
				f = i;
				break;
			}
		}

		for (int i = 0; i < alpha.length; i++) {
			if (alpha[i] != 0 && alpha[i] != f) {
				return false;
			}
		}
		return true;
	}
}
