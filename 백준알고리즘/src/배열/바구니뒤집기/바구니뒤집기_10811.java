package 배열.바구니뒤집기;

import java.io.*;
import java.util.*;

public class 바구니뒤집기_10811 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		int[] ba = new int[N];
		for(int i=0; i<N; i++) {
			ba[i] = i+1;	//바구니별로 공넣고
		}
		
		//방법입력받기
		for(int j=0; j<M; j++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken())-1;	//입력받은거를 배열인덱스로 바로 쓸거니까 -1씩 해주자
			int end = Integer.parseInt(st.nextToken())-1;
			//start에서 end부터 바구니 뒤집는다..
			// ex) [1,2,3,4,5]이고 start가 1, end가 5일때 비교. 다음으로 2와 4... 3과 3
			// start가 end보다 작을때까지만 반복
			while(start<end) {      //1 < 5 일때
				int temp = ba[start]; 
				ba[start] = ba[end];
				ba[end] = temp;  //한바퀴 돌았을때 1 5 교환됨
				start++;	//start는 2로
				end--;		//end는 4로
			}
		}
		//뒤집기끝
		StringBuilder sb = new StringBuilder();
		for(int k=0; k<ba.length; k++) {
			sb.append(ba[k]).append(' ');
		}
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
