package LogicBuildingPlanM1.Day2.IfLoops;

import java.util.Scanner;

public class Day2If4 {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if((n1+n2)%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
