package AbstractionAndPackagesAndExceptionHandling.ExceptionHandling.ExceptionHandlingThrowAndUsedDefinedException.ExceptionHandlingThrowAndUsedDefinedException3;

import java.util.InputMismatchException;

public class ExceptionHandlingThrowAndUsedDefinedException3 {
	public static void main(String[] args) throws AgeLimitException,InputMismatchException {
		try {
			@SuppressWarnings("unused")
			String name=args[0];
			int age=Integer.parseInt(args[1]);
			if(age<18||age>=60)
				throw new AgeLimitException("Age must be greater than or equal to 18 and less than 60");
			else
				System.out.println("Valid Details");
		}
		catch(InputMismatchException ex) {
			System.out.println(ex);
		}
		catch(AgeLimitException ex) {
			System.out.println("Age Limit Exception");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Provide arguments");
		}
	}
}
/*
Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60. 
Display proper error messages. 

The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
 (Hint : Create a user defined exception class for handling errors.)
*/