package OopsAndInheritence.StringAndStringBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAndStringBuffer5 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println(str.substring(1,str.length()-1));
	}
}

/*
Write a java program that accepts a string and returns a new string without the first and last character of the input string.

Example1)
i/p:Suman
o/p:uma
*/