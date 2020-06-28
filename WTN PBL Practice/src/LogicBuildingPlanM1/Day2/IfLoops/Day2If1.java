package LogicBuildingPlanM1.Day2.IfLoops;

import java.util.Scanner;

public class Day2If1 {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0)
			System.out.println("Positive");
		else if(n<0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
	}

}
