package JavaFundamentals.Loops.ForLoop;

public class Loop13ForLoop4 {
	public static void main(String[] args) {
		for(int i=10;i<=99;i++) {
			int count=0;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0)
				System.out.print(i+" ");
		}
	}
}


// Write a program to print prime numbers between 10 and 99.