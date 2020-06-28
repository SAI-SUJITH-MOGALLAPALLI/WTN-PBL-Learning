package JavaFundamentals.Loops.IfLoop;

import java.util.Scanner;

public class Loop5If5 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='a'&&ch<='z')
			System.out.println("Alphabet");
		else if(ch>='0'&&ch<='9')
			System.out.println("Digit");
		else
			System.out.println("Special Character");
	}
}

/*
Initialize a character variable in a program and 

print 'Alphabhet' if the initialized value is an alphabhet, 

print 'Digit' if the initialized value is a number, and 

print 'Special Character', if the initialized value is anything else.
*/