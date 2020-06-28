package JavaFundamentals.Arrays.OneDArray;

import java.util.Scanner;

public class Array12OneDArray12 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int[] ar=new int[3];
		int[] ar1=new int[3];
		int[] finArray=new int[2];
		for(int i=0;i<3;i++)
			ar[i]=sc.nextInt();
		for(int i=0;i<3;i++)
			ar1[i]=sc.nextInt();
		finArray[0]=ar[1];
		finArray[1]=ar1[1];
		for(int i=0;i<2;i++)
			System.out.print(finArray[i]+" ");
	}
}
/*
Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) - [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) - [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) - [2, 4]
*/