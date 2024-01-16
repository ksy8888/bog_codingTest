package 배열.과제안내신분;

import java.io.*;
import java.util.*;

public class 과제안내신분_5597 {
	//낸 사람을 1, 안낸 사람을 0으로 판별할것임.
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//학생 30명 출석번호는 1번부터 30번까지
		int[] stu_nums = new int[31];	//배열값들 0으로 초기화
		
		//과제 제출한 학생의 출석번호 입력.
		for(int i=1; i<=28; i++) {
			//출석번호에 해당하는 배열 원소의 값을 1로 증가
			stu_nums[Integer.parseInt(br.readLine())]++;
		}
		//제출 안한 사람
		for(int j=1; j<stu_nums.length; j++) {//1번부터 30번까지 찾아봄
			if(stu_nums[j]==0) { //0이면 안낸거니까
				bw.write(Integer.toString(j) + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
