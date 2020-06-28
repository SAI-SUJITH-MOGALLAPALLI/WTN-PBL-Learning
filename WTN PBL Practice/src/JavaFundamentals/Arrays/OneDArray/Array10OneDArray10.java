package JavaFundamentals.Arrays.OneDArray;

import java.util.Scanner;

public class Array10OneDArray10 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		int[] ar1=new int[n];
		int index=0;
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(ar[i]%2==0)
				ar1[index++]=ar[i];
		}
		for(int i=0;i<n;i++) {
			if(ar[i]%2!=0)
				ar1[index++]=ar[i];
		}
		for(int i=0;i<n;i++) {
			ar[i]=ar1[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(ar[i]+" ");
		}
	}
}
/*
Print an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) - [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) - [2, 3, 3]
evenOdd([2, 2, 2]) - [2, 2, 2]
*/