package Day8;

public class user_insta {
	
	String UID;
	int password;
	String bio;

	
	user_insta(String UID,int password){
		this.UID=UID;
		this.password=password;
	}
	user_insta(String UID,int password,String bio){
		this(UID,password); //Constructor Chaining
		this.bio=bio;
	}
}
