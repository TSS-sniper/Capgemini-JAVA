package Day17.Exception;

public class multiple_catchBlock {

	public static void main(String[] args) {
		System.out.println("Main Start");
		int [] arr = new int [2];
		try {
			System.out.println(arr[2]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Child Catch Start");
			System.out.println(e.getMessage());
			System.out.println("Child Catch End");
		}
		catch(Exception e){
			System.out.println("Parent Catch Start");
			System.out.println(e.getMessage());
			System.out.println("Parent Catch End");
		}
		finally {
			System.out.println("finally block");
		}
		
		System.out.println("Main End");

	}

}
