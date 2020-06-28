package JavaFundamentals.Arrays.OneDArray;

import java.util.Scanner;

public class Array3OneDArray3 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		int k=sc.nextInt();
		int flag=0,i;
		for(i=0;i<n;i++) {
			if(ar[i]==k) {
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println(i);
		else
			System.out.println(-1);
		
	}
}


/*
Write a program to initialize an integer array with values and check if a given number is present in the array or not.

If the number is not found, it will print -1 else it will print the index value of the given  number in the array.

Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.

Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.
*/