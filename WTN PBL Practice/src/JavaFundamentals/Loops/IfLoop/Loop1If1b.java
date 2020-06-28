package JavaFundamentals.Loops.IfLoop;

import java.util.Scanner;

public class Loop1If1b {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1%10==n2%10)
			System.out.println(true);
		else
			System.out.println(false);
	}
}

/*
B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. 

     lastDigit(7, 17) - true
     lastDigit(6, 17) - false
     lastDigit(3, 113) - true
*/