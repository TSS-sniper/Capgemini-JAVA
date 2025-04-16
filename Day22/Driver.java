package Day22;

public class Driver {
	public static void main(String[] args) {
		Case_Study_Stack s = new Case_Study_Stack();
		Case_Study_Stack f = new Case_Study_Stack();
		s.visit("www.abc.com");
		s.visit("www.gov.in");
		s.visit("www.gfg.com");
		s.visit("www.youtube.com");
		s.visit("www.museasia.com");
		System.out.println("Previous Page: "+s.back());
		s.current_page();
		f.visit(s.back());
		f.visit(s.back());
		s.print();
		s.visit(f.forward());
		s.visit(f.forward());
		s.print();
		
	}

}
