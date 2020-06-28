package JavaFundamentals.Loops.WhileLoop;

import java.util.Scanner;

public class Loop16WhileLoop1 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int num=sc.nextInt();
		int revNum=0;
		while(num>0) {
			revNum=revNum*10+num%10;
			num=num/10;
		}
		System.out.println(revNum);
	}
}

/*
Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001
*/