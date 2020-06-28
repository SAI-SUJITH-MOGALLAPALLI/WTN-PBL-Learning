package LogicBuildingPlanM1.Day3;

import java.util.Scanner;

public class IsOdd {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isOdd(n)==1)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
	private static int isOdd(int n) {
		if(n%2==0)
		return 1;
		return 0;
	}
}
