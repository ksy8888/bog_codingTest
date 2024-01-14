package 배열;

import java.io.*;
import java.util.*;

public class 문제_10807_정수몇개 {
//총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
/* <입력>
* 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 
* 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
*/
	/*<출력>
	 * 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
	*/
	public static void main(String[] args)  throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//N개의 정수
		int N = Integer.parseInt(br.readLine());
//*** 백준 사이트에서는 N+1로 선언하고 반복문 시작을 i=1로하면 틀렸다고 판정됨
//	int[] nums = new int[N];
// 	for(int i=0; i<N; i++) { .. } 이렇게하자... 시간을 날렸다.. 
		//N개의 정수가 담긴 nums 배열 생성
		int[] nums = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		//nums 배열에 값 채우기
		for(int i=1; i<=N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		//v 입력 받기
		int v = Integer.parseInt(br.readLine());
		int count = 0;
		for(int j=0; j<nums.length; j++) {
			//입력받은 v찾기
			if(nums[j]==v) {
				count++;
			}
		}
		
		bw.write(count+"\n");
		bw.flush();
		bw.close();
		br.close();
		
	}
}
