package JavaFundamentals.Arrays.OneDArray;

import java.util.Scanner;

public class Array6OneDArray6 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(ar[j]>ar[j+1]) {
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(ar[i]+" ");
		}
	}
}

/*
  Write a program to initialize an array and print them in a sorted order.
 */
