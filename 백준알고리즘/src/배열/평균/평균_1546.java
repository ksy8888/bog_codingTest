package 배열.평균;

import java.io.*;
import java.util.StringTokenizer;

public class 평균_1546 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double[] score = new double[N];
		for(int i=0; i<N; i++) {
			score[i] = Double.parseDouble(st.nextToken());
		}
		
		double max = score[0];
		double sum = 0;
		for(int j=0; j<score.length; j++) {
			if(max<score[j]) {
				max = score[j];
			}
		}
		
		for(int j=0; j<N; j++) {
			score[j] = score[j]/max*100; //점수 변환시키기
			sum += score[j];   //변환시킨 점수를 합계에 더하기
		}
		//평균 출력@@
		System.out.println(sum/(double)N);
		
	}

}
