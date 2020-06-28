package LogicBuildingPlanM1.Day3;

import java.util.Scanner;

public class IsEven {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isEven(n)==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
	private static int isEven(int n) {
		if(n%2==0)
		return 0;
		return 1;
	}
}
