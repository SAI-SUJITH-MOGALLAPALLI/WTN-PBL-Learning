package JavaFundamentals.Arrays.OneDArray;

import java.util.Scanner;

public class Array9OneDArray9 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		int n1=n;
		for(int i=0;i<n;i++) {
			if(ar[i]==10) {
				for(int j=i;j<n-1;j++) {
					ar[j]=ar[j+1];
				}
				ar[n-1]=0;
				n--;
				i--;
			}
		}
		for(int i=0;i<n1;i++)
			System.out.print(ar[i]+" ");
	}
}

/*
  Print a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the given array or make a new array.

withoutTen([1, 10, 10, 2]) - [1, 2, 0, 0]
withoutTen([10, 2, 10]) - [2, 0, 0]
withoutTen([1, 99, 10]) - [1, 99, 0]
 */
