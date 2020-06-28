package JavaFundamentals.Arrays.OneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class Array7OneDArray7 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		ar[0]=sc.nextInt();
		int max=ar[0];
		for(int i=1;i<n;i++) {
			ar[i]=sc.nextInt();
			if(ar[i]>max)
				max=ar[i];
		}
		int[] h=new int[max+1];
		Arrays.fill(h,0);
		int[] temp=new int[n];
		int index=0;
		for(int i=0;i<n;i++) {
			if(h[ar[i]]==0) {
			h[ar[i]]++;
			temp[index++]=ar[i];
			}
		}
		for(int i=0;i<index;i++) {
			ar[i]=temp[i];
			System.out.print(ar[i]+" ");
		}
	}
}


/*
  Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}
*/