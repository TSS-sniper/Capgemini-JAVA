package Day33.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddDigit {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d+");
		String st = "AbcD1PQR3X42";
		Matcher m = p.matcher(st);
		int sum = 0;
		while (m.find()) {
			sum += Integer.parseInt(m.group());
		}
		System.out.println(sum);
	}

}
