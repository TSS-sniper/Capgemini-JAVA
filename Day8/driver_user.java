package Day8;

public class driver_user {
	public static void main(String[] args) {
		user_insta u1 = new user_insta("im._tss", 12345);
		user_insta u2 = new user_insta("tanmay", 12045,"i sumport Violens");
		System.out.println("User: "+u1.UID+"\nPassword: "+u1.password);
		System.out.println("");
		System.out.println("User: "+u2.UID+"\nPassword: "+u2.password+"\nBio: "+u2.bio);
	}
}
