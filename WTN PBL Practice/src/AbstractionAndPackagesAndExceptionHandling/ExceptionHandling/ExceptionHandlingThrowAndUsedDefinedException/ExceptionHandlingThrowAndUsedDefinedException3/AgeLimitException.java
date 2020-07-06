package AbstractionAndPackagesAndExceptionHandling.ExceptionHandling.ExceptionHandlingThrowAndUsedDefinedException.ExceptionHandlingThrowAndUsedDefinedException3;

@SuppressWarnings("serial")
public class AgeLimitException extends Exception {
	String str;
	AgeLimitException(String str){
		this.str=str;
	}
}
