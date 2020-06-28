package OopsAndInheritence.StringAndStringBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAndStringBuffer8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringBuffer sb1=new StringBuffer();
		int ind=str.indexOf('*');
		if(ind!=-1)
			sb1.append(str.substring(0,ind-1)).append(str.substring(ind+2));
		else
			sb1.append(str);
		System.out.println(sb1);
	}

}

/*
 Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *

Example1)
i/p:ab*cd
o/p:ad
*/