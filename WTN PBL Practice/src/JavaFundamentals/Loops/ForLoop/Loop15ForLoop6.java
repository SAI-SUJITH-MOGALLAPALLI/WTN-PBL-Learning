package JavaFundamentals.Loops.ForLoop;

import java.util.Scanner;

public class Loop15ForLoop6 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}


/*
 Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *

Example1)
C:\>java Sample 
O/P: Please enter an integer number

Example2)
C:\>java Sample 3
O/P :
*
*  * 
*  *  *
*/