package JavaFundamentals.Arrays.TwoDArray;

public class Array14TwoDArray2 {
	public static void main(String[] args) {
		int[][] ar=new int[3][3];
		int index=0;
		int max=Integer.parseInt(args[0]);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ar[i][j]=Integer.parseInt(args[index++]);
				if(ar[i][j]>max)
					max=ar[i][j];
			}
		}
		System.out.println(max);
	}
}
/*
 Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.


Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers

Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P: 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222
*/