package Day16.String_intro;

public class string_methods {

	public static void main(String[] args) {
		String str1 = "Tarun Sheoran";
		String str2 = "Varun Sheoran";
		String str3 = "TARUN Sheoran";
		String str4 = "";
		// String str5=null;
		String str6 = "  ";
		String str7 = "ABABABCCC";
		String str8 = "ababababc";
		String str9 = "    HIHI   ";
		System.out.println("Basic Methods:");
		System.out.println(str1.length());
		System.out.println(str1.charAt(6));
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(0, 6)); // end index is exclusive
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str4.isEmpty());
		System.out.println(str6.isBlank()); // checks blank
		// System.out.println(str5.isEmpty()); //gives NullPointerException
		System.out.println(str1.compareTo(str3)); // gives ASCII difference and compares without equals and its
													// return-type is int

		// Searching Methods and Matching
		System.out.println("");
		System.out.println("Searching and Matching Methods:");
		System.out.println(str1.contains("Sh"));
		System.out.println(str1.indexOf("n"));
		System.out.println(str2.lastIndexOf("a"));
		System.out.println(str1.startsWith("tar"));
		System.out.println(str2.endsWith("ran"));

		// Modification and Replacement Methods:
		System.out.println("");
		System.out.println("Modification and Replacement Methods:");
		System.out.println(str7.replace('A', 'D'));
		System.out.println(str2.replaceAll("Varun", "TSS"));
		System.out.println(str2.replaceAll("\\s", "_")); // regex
		System.out.println(str3.replaceFirst("TAR", "Tar"));
		System.out.println(str3); // returns a different String object and dont change the original string
		System.out.println(str7.toLowerCase());
		System.out.println(str8.toUpperCase());
		System.out.println(str9.trim()); // trims all leading and trailing spaces

		// Splitting:
		// returns a String type array
		System.out.println("");
		System.out.println("Splitting: ");
		String str10 = "I LOVE MY INDIA";
		String[] strarr = str10.split(" ");
		for (String string : strarr) {
			System.out.println(string);
		}

	}
}
