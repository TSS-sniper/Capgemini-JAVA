package Day25.Linear_Search;

import java.util.Arrays;

public class Case_Study {
	public static void main(String[] args) {
		String data[][] = { { "SAT-01", "12:00:01", "SIG-AB123" }, { "SAT-02", "12:00:02", "SIG-X9873" },
				{ "SAT-03", "12:00:03", "SIG-YY451" }, { "SAT-04", "12:00:04", "SIG-ZZ002" },
				{ "SAT-05", "12:00:05", "SIG-X9873" } };
		String target = "SIG-X9873";
		for (int i = 0; i < data.length; i++) {
			if (data[i][2].equals(target)) {
				System.out.println(Arrays.toString(data[i]));
				break;
			}
		}
	}
}
