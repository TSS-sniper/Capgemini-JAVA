package Day17.Exception;

public class when_finally_not_executed {
	public static void main(String[] args) {
		System.out.println("START");
	try{
		System.out.println(10 / 0);
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
		System.exit(0); //EXITS and JVM shuts down
	}
	finally {
		System.out.println("END"); //wouldn't be executed... bcz of System.exit(<integer value>);
	}}}
