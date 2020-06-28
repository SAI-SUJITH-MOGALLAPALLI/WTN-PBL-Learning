package JavaFundamentals.Arrays.TwoDArray;

public class Array13TwoDArray1 {
	public static void main(String[] args) {
		int k=args.length;
		int k1=(int)Math.sqrt(k);
		k1=k1*k1;
		if(k!=k1) {
			k1=(int)Math.sqrt(k);
			k1=(k1+1)*(k1+1);
			System.out.println("Please enter "+(args.length+1)+" integer numbers");
		}
		else {
			k1=(int)Math.sqrt(k);
			int index=0;
			int[][] ar=new int[k][k];
			for(int i=0;i<k1;i++) {
				for(int j=0;j<k1;j++) {
					ar[i][j]=Integer.parseInt(args[index++]);
					
				}
			}
			System.out.println("The array is :");
			for(int i=0;i<k1;i++) {
				for(int j=0;j<k1;j++) {
					System.out.print(ar[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("The reverse of the array is:");
			for(int i=k1-1;i>=0;i--) {
				for(int j=k1-1;j>=0;j--) {
					System.out.print(ar[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}

/*
 Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers

Example2)
C:\>java Sample 1 2 3 4
O/P: 
 The given array is :
  1 2 
  3 4 
 The reverse of the array is :
  4 3 
  2 1
 */
