package 배열.최대최소_10818;

import java.io.*;
import java.util.*;

public class 문제_10818 {
//문제
//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		int max = nums[0];
		int min = nums[0];
		for(int j=0; j<nums.length; j++) {
			if(min > nums[j]) {
				min = nums[j];
			} else if(max < nums[j]) {
				max = nums[j];
			}
		}
		sb.append(min).append(" ").append(max);
		bw.write(String.valueOf(sb));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
