package OopsAndInheritence.StringAndStringBuffer;

import java.io.*;

public class StringAndStringBuffer1 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		if(palindrome(str)==true)
			System.out.println(str+" is a palindrome");
		else
			System.out.println(str+" is not a palindrome");
	}

	private static boolean palindrome(String str) {
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		String str1=new String(sb.reverse());
		if(str.equalsIgnoreCase(str1))
			return true;
		return false;
	}

}
/*
 Write a Program to check whether a given String is Palindrome or not.
 */
