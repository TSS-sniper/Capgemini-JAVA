package Day17.Exception.custom_exception;

	public class InvalidAgeException extends RuntimeException{
		
		public InvalidAgeException() {
		super("Age is less than 18");
	}}
