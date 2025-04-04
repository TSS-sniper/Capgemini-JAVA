package Day14.interface_intro.DiamondProblem;

public class C1 implements P1,P2{

	public static void main(String[] args) {
		System.out.println(P1.k);
		System.out.println(P2.k);
		System.out.println("");
		//m1();  //static methods arn't inherited from interface and not part of Diamond problem
		P1.m1();
		P2.m1();

	}

}
