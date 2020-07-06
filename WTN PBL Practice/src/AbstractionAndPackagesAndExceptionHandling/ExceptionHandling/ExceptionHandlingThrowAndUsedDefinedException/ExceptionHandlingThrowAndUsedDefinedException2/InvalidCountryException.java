package AbstractionAndPackagesAndExceptionHandling.ExceptionHandling.ExceptionHandlingThrowAndUsedDefinedException.ExceptionHandlingThrowAndUsedDefinedException2;

@SuppressWarnings("serial")
public class InvalidCountryException extends Exception {
	String str;
	InvalidCountryException(String str){
		this.str=str;
	}
	public String toString() {
		return str;
	}
}
