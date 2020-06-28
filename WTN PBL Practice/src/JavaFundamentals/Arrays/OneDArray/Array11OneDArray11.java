package JavaFundamentals.Arrays.OneDArray;

import java.util.Scanner;

public class Array11OneDArray11 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		boolean b=true;
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(ar[i]!=1&&ar[i]!=4) {
				b=false;
				break;
			}
		}
		System.out.println(b);
	}
}
/*
Given an array of type int, print true if every element is 1 or 4. 

only14([1, 4, 1, 4]) - true
only14([1, 4, 2, 4]) - false
only14([1, 1]) - true
*/