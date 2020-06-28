package OopsAndInheritence.StringAndStringBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAndStringBuffer2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String str2=br.readLine();
		String ans="";
		if(str1.charAt(str1.length()-1)==str2.charAt(0))
			ans=str1+str2.substring(1);
		else
		ans=str1+" "+str2;
		System.out.println(ans.toLowerCase());
	}
}
/* 
Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.

Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar

Example2)
i/p:Mark,kate
o/p:markate

*/