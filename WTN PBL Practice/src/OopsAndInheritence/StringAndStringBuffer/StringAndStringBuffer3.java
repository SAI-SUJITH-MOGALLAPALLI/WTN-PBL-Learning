package OopsAndInheritence.StringAndStringBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAndStringBuffer3 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer str=new StringBuffer(br.readLine());
		StringBuffer ans=new StringBuffer();
		for(int i=0;i<str.length();i++)
			ans=ans.append(str.substring(0,2));
		System.out.println(ans);
	}
}

/* 
Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.

Example1)
i/p:Wipro
o/p:WiWiWiWiWi
*/