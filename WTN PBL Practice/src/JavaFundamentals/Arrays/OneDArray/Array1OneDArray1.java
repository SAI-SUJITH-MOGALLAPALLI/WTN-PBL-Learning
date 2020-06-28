package JavaFundamentals.Arrays.OneDArray;

import java.util.Scanner;

public class Array1OneDArray1 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		int sum=0;
		double avg;
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
			sum=sum+ar[i];
		}
		avg=sum/n;
		System.out.println("Sum:"+sum);
		System.out.println("Average:"+avg);
		
	}
}
/*

Write a program to initialize an integer array and print the sum and average of the array
*/