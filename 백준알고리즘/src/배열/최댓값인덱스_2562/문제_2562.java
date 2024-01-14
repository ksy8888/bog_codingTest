package 배열.최댓값인덱스_2562;

import java.io.*;
import java.util.*;

public class 문제_2562 {
//<문제>
/*
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
예를 들어, 서로 다른 9개의 자연수
3, 29, 38, 12, 57, 74, 40, 85, 61
이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다..
 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nums = new int[9];
		for(int i=0; i<nums.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = nums[0];
		//첫 번째 값을 입력받고 시작했기 때문에 증가가 된 뒤에 처리를 하는 것이 맞다.
		int count = 1; //그래서 카운트 1부터...
		for(int j=0; j<nums.length; j++) {
			if(max < nums[j]) {
				max = nums[j];
				//max값의 위치를 찾기 위해서는, max값이 갱신될 때마다 그 때의 인덱스를 저장해야함
				//count++;이거아님
				count = j+1; //배열이니 +1
			}
		}
		bw.write(String.valueOf(max));
		bw.newLine();
		bw.write(String.valueOf(count));
	//	System.out.println(max);
		//System.out.println(count);
		bw.flush();
		bw.close();
		br.close();
	}
}
