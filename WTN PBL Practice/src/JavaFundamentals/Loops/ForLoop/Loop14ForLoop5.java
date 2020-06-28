package JavaFundamentals.Loops.ForLoop;

import java.util.Scanner;

public class Loop14ForLoop5 {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			sum=sum+(n%10);
			n/=10;
		}
		System.out.println(sum);
	}
}

/*
Write a program to print the sum of all the digits of a given number.

Example1) 
I/P:1234
O/P:10
*/