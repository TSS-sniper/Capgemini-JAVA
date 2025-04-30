package Day33.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_intro {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\d+");
		String st = "8abc";
//		Pattern p=Pattern.compile( "^[A-Za-z0-9+_.-]+@gmail\\.com$");
//		String st = "anshika@gmail.com";
        Matcher m=p.matcher(st);
    
        System.out.println(m.find());
	}

}