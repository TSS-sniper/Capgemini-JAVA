package Day16.String_intro;

public class bakshi_possibleWord_problem {

	public static void main(String[] args) {
		String ip1 = "Fi_er";
		String ip2 = "Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer";
		give_word(ip1, ip2);
	}

	public static void give_word(String ip1, String ip2) {
		int l1 = ip1.length();
		ip1 = ip1.toUpperCase();
		ip2 = ip2.toUpperCase();
		String[] comArr = ip2.split(":");
		int uns = 0;
		for (int i = 0; i < ip1.length(); i++) {
			if (ip1.charAt(i) == '_') {
				uns = i;
			}
		}

		String result = "";
		String subf = ip1.substring(0, uns);
		String sube = ip1.substring(uns + 1, l1);
		for (int i = 0; i < comArr.length; i++) {
			if (comArr[i].startsWith(subf) && comArr[i].endsWith(sube) && comArr[i].length() == l1) {
				result = result + comArr[i] + ":";
			}
		}
		result = result.substring(0, result.length() - 1);
		System.out.println(result);
	}
}
