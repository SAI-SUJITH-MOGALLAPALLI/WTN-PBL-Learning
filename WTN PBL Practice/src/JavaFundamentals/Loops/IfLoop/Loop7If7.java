package JavaFundamentals.Loops.IfLoop;

import java.util.Scanner;

public class Loop7If7 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='a'&&ch<='z')
			System.out.println(ch-'a'+'A');
		else if(ch>='A'&&ch<='Z')
			System.out.println(ch-'A'+'a');
	}
}

/*
Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.

Example1)
i/p:a
o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase in the following format.

Example2)
i/p:A
o/p:A->a
*/