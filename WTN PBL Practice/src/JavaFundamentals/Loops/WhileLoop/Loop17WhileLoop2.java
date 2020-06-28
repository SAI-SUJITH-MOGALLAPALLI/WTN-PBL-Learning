package JavaFundamentals.Loops.WhileLoop;

import java.util.Scanner;

public class Loop17WhileLoop2 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num;
		int revNum=0;
		while(num>0) {
			revNum=revNum*10+num%10;
			num=num/10;
		}
		if(num1==revNum)
			System.out.println(num1+" is a palindrome");
		else
			System.out.println(num1+" is not a palindrome");
	}
}

/*
Write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome
*/