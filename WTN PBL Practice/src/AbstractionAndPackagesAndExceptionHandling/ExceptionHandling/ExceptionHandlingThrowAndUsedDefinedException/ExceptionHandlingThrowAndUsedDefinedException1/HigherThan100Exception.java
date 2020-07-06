package AbstractionAndPackagesAndExceptionHandling.ExceptionHandling.ExceptionHandlingThrowAndUsedDefinedException.ExceptionHandlingThrowAndUsedDefinedException1;

@SuppressWarnings("serial")
public class HigherThan100Exception extends Exception {
	String str;
	HigherThan100Exception(String str){
		this.str=str;
	}
	public String toString() {
		return str;
	}
}
