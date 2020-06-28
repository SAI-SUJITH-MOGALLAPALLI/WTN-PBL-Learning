package JavaFundamentals.Arrays.OneDArray;

import java.util.Scanner;

public class Array8OneDArray8 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++) {
			if(ar[i]==6) {
				int flag=0,j;
				for(j=i+1;j<n;j++) {
					if(ar[j]==7) {
						flag=1;
						break;
					}
				}
				if(flag==0)
					sum=sum+ar[i];
				else
					i=j;
			}
			else {
				sum=sum+ar[i];
			}
		}
		System.out.println(sum);
	}
}


/*
  Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10
 */
