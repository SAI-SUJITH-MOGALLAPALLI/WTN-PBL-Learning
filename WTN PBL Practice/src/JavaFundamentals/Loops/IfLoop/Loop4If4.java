package JavaFundamentals.Loops.IfLoop;


public class Loop4If4 {
	public static void main(String[] args) {
		char ch1=args[0].charAt(0);
		char ch2=args[0].charAt(0);
		if(ch1>ch2)
			System.out.println(ch2+","+ch1);
		else
			System.out.println(ch1+","+ch2);
	}
}

/*
Initialize two character variables in a program and display the characters in alphabetical order.

Example1) if the first character is 's' and second character is 'e' then the output should be  e,s

Example2) if the first character is 'a' and second character is 'e', then the output should be a,e
*/