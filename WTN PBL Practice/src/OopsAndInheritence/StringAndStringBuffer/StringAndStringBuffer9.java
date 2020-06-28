package OopsAndInheritence.StringAndStringBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAndStringBuffer9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String str2=br.readLine();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str1.length()||i<str2.length();i++) {
			if(i<str1.length())
				sb.append(str1.charAt(i));
			if(i<str2.length())
				sb.append(str2.charAt(i));
		}
		System.out.println(sb);
	}

}
/*
 Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on. 
Any characters left, will go to the end of the result.

Example1)
i/p:Hello,World
o/p:HWeolrllod

 */
