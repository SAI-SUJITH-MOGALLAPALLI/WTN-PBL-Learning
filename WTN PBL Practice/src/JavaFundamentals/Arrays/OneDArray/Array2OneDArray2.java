package JavaFundamentals.Arrays.OneDArray;

import java.util.Scanner;

public class Array2OneDArray2 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		ar[0]=sc.nextInt();
		int max=ar[0],min=ar[0];
		for(int i=1;i<n;i++) {
			ar[i]=sc.nextInt();
			if(ar[i]>max)
				max=ar[i];
			if(ar[i]<min)
				min=ar[i];
		}
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);
	}
}
/*
Write a program to initialize an integer array and find the maximum and minimum value of the array.
*/