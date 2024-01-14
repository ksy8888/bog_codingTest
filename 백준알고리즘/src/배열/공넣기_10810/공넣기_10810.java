package 배열.공넣기_10810;

import java.io.*;
import java.util.*;

public class 공넣기_10810 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		//바구니 N개와 M개의 공넣는 방법
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		//바구니 배열 생성
		int[] ba = new int[N]; // 모든 바구니가 0으로 초기화 시켰기 때문에, 바구니 비어있는 경우를 처리 안해줘도됨.
		// I번 바구니부터 J번 바구니까지에 K번 번호가 적혀져 있는 공
		//공넣는 방법 입력
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			//바구니 배열에 넣기. I번부터인데 배열이니 -1해줌
			for(int j=I-1; j<J; j++) {
				ba[j] = K;
			}
		}
		for(int k=0; k<ba.length; k++) {
//			if(ba[k]==0) {
//				필요없다. 위에서 0으로 초기화했고, 모든 바구니에는 최소한 하나의 공이 놓여진다.
//			}
			bw.write(ba[k]+" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
