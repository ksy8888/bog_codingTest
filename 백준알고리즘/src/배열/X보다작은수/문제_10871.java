package 배열.X보다작은수;

import java.io.*;
import java.util.*;

public class 문제_10871 {
//<문제>
//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); 
		int X = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N];
		st = new StringTokenizer(br.readLine()); 	///////
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int j=0; j<A.length; j++) {
			//x 와 a 비교
			if(A[j] < X) {
				// A[j]가 X보다 작은 경우 StringBuilder에 A[j]를 추가해야 한다.
				// str = sb.toString();
				sb.append(A[j]).append(' ');	////
			}
		}
		String str = sb.toString();
		bw.write(str);
		bw.flush();
		bw.close();
		br.close();
	}

}
