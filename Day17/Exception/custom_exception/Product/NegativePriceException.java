package Day17.Exception.custom_exception.Product;

public class NegativePriceException extends Exception {
	public NegativePriceException() {
		super("The price cannot be Negative");
	}

}
