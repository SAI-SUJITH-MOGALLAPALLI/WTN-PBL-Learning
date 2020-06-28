package OopsAndInheritence.StringAndStringBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAndStringBuffer7 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int begin=0,end=str.length();
		if(str.startsWith("x"))
			begin=1;
		if(str.endsWith("x"))
			end=str.length()-1;
		System.out.println(str.substring(begin,end));
	}
}
/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged. 

If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America".
*/