package JavaFundamentals.Loops.ForLoop;

import java.util.Scanner;

public class Loop12ForLoop3 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("Prime");
		else
			System.out.println("Not a Prime");
	}
}

// Write a program to check if a given number is prime or not.