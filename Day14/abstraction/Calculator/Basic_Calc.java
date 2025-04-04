package Day14.abstraction.Calculator;


public class Basic_Calc extends Calc{
	public double Cal(double a,double b, char op) {
		double result =0;
		switch(op) {
		case '+':{
			result = a+b;
		}break;
		case '-':{
			result = a-b;
		}break;
		case '*':{
			result = a*b;
		}break;
		case '/':{
			result=a/b;
		}break;
		default:{
			return 0.0;
		}
		}
		return result;
	}
}
