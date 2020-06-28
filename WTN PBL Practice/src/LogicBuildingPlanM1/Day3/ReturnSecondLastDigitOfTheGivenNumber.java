package LogicBuildingPlanM1.Day3;

import java.util.Scanner;

public class ReturnSecondLastDigitOfTheGivenNumber {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n/10!=0)
		System.out.println(returnSecondLastDigitOfTheGivenNumber(Math.abs(n)));
		else
			System.out.println("-1");
	}
	private static int returnSecondLastDigitOfTheGivenNumber(int n) {
		n/=10;
		return n%10;
	}
}
