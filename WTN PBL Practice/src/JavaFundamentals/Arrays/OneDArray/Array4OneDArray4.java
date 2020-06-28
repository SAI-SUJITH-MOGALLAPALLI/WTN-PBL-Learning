package JavaFundamentals.Arrays.OneDArray;

import java.util.Scanner;

public class Array4OneDArray4 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			char ch=(char)ar[i];
			System.out.print(ch+" ");
		}
	}
}

/*
Initialize an integer array with ascii values and print the corresponding character values in a single row.
*/