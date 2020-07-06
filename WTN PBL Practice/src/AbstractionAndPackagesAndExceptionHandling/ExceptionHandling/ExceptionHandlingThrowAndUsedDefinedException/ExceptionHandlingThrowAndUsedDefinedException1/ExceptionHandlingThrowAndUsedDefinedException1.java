package AbstractionAndPackagesAndExceptionHandling.ExceptionHandling.ExceptionHandlingThrowAndUsedDefinedException.ExceptionHandlingThrowAndUsedDefinedException1;

import java.util.*;
public class ExceptionHandlingThrowAndUsedDefinedException1 {
	private static Scanner sc;
	public static void main(String[] args) throws NegativeNumberException,HigherThan100Exception{
		Student[] student=new Student[2];
		sc=new Scanner(System.in);
		try {
			for(int i=0;i<2;i++) {
				System.out.print("Enter the name of the "+(i+1)+" student:");
				String name=sc.nextLine();
				int[] marks=new int[3];
				System.out.println("Enter the marks of "+name+":");
				for(int j=0;j<3;j++) {
					marks[j]=sc.nextInt();
					if(marks[j]<0)
						throw new NegativeNumberException("Number must be positive");
					if(marks[j]>100)
						throw new HigherThan100Exception("Number must be less than 100");
				}
				double avg=avg(marks);
				student[i]=new Student(name,marks,avg);
				System.out.println("Average of the marks of the "+name+":"+avg);
			}
		}
		catch(InputMismatchException ex) {
			System.out.println(ex);
		}
		catch(NegativeNumberException ex) {
			ex.printStackTrace();
		}
		catch(HigherThan100Exception ex) {
			ex.printStackTrace();
		}
	}
	private static double avg(int[] marks) {
		int sum=0;
		for(int i=0;i<3;i++)
			sum=sum+marks[i];
		return sum/3;
	}

}

/*
  Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)

 */
