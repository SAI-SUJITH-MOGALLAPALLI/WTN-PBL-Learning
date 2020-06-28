package LogicBuildingPlanM1.Day3;

import java.util.Scanner;

public class ReturnLatDigitOfTheGivenNumber {

	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(returnLastDigitOfTheGivenNumber(Math.abs(n)));
	}
	private static int returnLastDigitOfTheGivenNumber(int n) {
		return n%10;
	}
}
