package JavaFundamentals.Arrays.OneDArray;

import java.util.Scanner;

public class Array5OneDArray5 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int max1=ar[0],max2=ar[0],min1=ar[0],min2=ar[0];
		for(int i=1;i<n;i++) {
			if(ar[i]>max1)
				max1=ar[i];
			if(ar[i]<min1)
				min1=ar[i];
		}
		for(int i=1;i<n;i++) {
			if(ar[i]>max2&&ar[i]!=max1)
				max2=ar[i];
			if(ar[i]<min2&&ar[i]!=min1)
				min2=ar[i];
		}
		System.out.println("Max1:"+max1+" Max2:"+max2);
		System.out.println("Min1:"+min1+" Min2:"+min2);
	}
}


/* Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
*/