package 문자열.문자와문자열;

import java.io.*;

public class 문자와문자열_27866 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine(); //Sprout 
		int I = Integer.parseInt(br.readLine()); //3
		
		for(int i=1; i<=S.length(); i++) { 
			if(i == I) {
				System.out.println(S.substring(I-1,I));
			}
		}
	}

}
