package AbstractionAndPackagesAndExceptionHandling.ExceptionHandling.ExceptionHandlingThrowAndUsedDefinedException.ExceptionHandlingThrowAndUsedDefinedException1;


@SuppressWarnings("serial")
public class NegativeNumberException extends Exception {
	String str;
	NegativeNumberException(String str){
		this.str=str;
	}
	public String toString() {
		return str;
	}
}