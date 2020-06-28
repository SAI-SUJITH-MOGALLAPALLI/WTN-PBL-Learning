package OopsAndInheritence.StringAndStringBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAndStringBuffer10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int k=Integer.parseInt(br.readLine());
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<k;i++)
			sb.append(str.substring(str.length()-k));
		System.out.println(sb);
	}

}
/*
Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive. 

Example1)
i/p:Wipro,3
o/p:propropro
*/