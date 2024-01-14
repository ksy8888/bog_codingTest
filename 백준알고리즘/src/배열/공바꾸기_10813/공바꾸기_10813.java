package 배열.공바꾸기_10813;

import java.io.*;
import java.util.*;

public class 공바꾸기_10813 {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] ba = new int[N];
		for(int i=0; i<N; i++) {
			ba[i] = i+1;
			//ba[0] ba[1] ba[2] ba[3] ba[4]
			//  1    2     3     4      5
		}
		
		for(int j=0; j<M; j++) {
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken()); //1   //3 
			int J = Integer.parseInt(st.nextToken()); //2   //4 
			int temp = ba[I-1]; //temp=> ba[0]
			ba[I-1] = ba[J-1];  //ba[0]=> ba[1]
			ba[J-1] = temp;		//ba[1] => ba[0]
			
		}
		for(int k=0; k<ba.length; k++) {

			bw.write(ba[k]+" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
