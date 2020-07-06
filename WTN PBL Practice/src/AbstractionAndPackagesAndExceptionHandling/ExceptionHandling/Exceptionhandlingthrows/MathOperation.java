package AbstractionAndPackagesAndExceptionHandling.ExceptionHandling.Exceptionhandlingthrows;

public class MathOperation {
	public static void main(String[] args) throws Exception {
		int[] ar=new int[5];
		try {
			ar=arrayInitialize(ar,args);
			int sum=sumOfArray(ar);
			System.out.println("Sum: "+sum);
			int average=avg(ar,sum,args);
			System.out.println("Average: "+average);
		}
		catch(NumberFormatException ex) {
			System.out.println(ex);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}
	}

	private static int avg(int[] ar,int sum,String[] args) throws ArithmeticException{
		return sum/args.length;
	}

	private static int sumOfArray(int[] ar) {
		int sum=0;
		for(int a:ar)
			sum=sum+a;
		return sum;
	}

	private static int[] arrayInitialize(int[] ar, String[] args) throws Exception{
		for(int i=0;i<5;i++)
			ar[i]=Integer.parseInt(args[i]);
		return ar;
	}
}

/*
 Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements and display the result. 

Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.

*/