package OopsAndInheritence.StringAndStringBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAndStringBuffer6 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String str2=br.readLine();
		String ans="";
		if(str1.length()<str2.length()) {
			ans=ans+str1+str2+str1;
		}
		else if(str2.length()>str1.length()) {
			ans=ans+str2+str1+str2;
		}
		if(ans=="")
			System.out.println("Both Strings cannot be same length");
		else
			System.out.println(ans);
	}
}

/*
Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.

The strings will not be the same length, but they may be empty (length 0).

If input is "hi" and "hello", then output will be "hihellohi".
*/