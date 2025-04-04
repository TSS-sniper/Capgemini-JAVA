package Day14.abstraction.Calculator;

public class Adv_Calc extends Basic_Calc{
	
	public double Cal(double a,double b, char op) {
		double result =0;
		switch(op) {
		case '^':{
			result = Math.pow((int)a,(int)b);
		}break;
		
		case '%':{
			result = a%b;
		}break;
	
		default:{
			return super.Cal(a, b, op);
		}
		}
		return result;
	}

}
