package LogicBuildingPlanM1.Day3;

import java.util.Scanner;

public class SumOfLastDigitsOfTwoNumbers {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println(addLastDigits(n1,n2));
	}
	private static int addLastDigits(int n1, int n2) {
		// TODO Auto-generated method stub
		return ((n1%10)+(n2%10));
	}
}
