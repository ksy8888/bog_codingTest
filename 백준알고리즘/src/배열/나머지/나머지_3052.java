package 배열.나머지;

import java.io.*;

public class 나머지_3052 {
//10개의 수 입력. 이 수 각각을 42로 나누었을 때 서로 다른 나머지는 몇개인가?
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//어떤 수를 n으로 나누었을 때 나머지가 나올 수 있는 수는 0~n-1까지
		//nums 배열은 0부터 41까지의 각 숫자가 입력받은 숫자들의 42로 나눈 나머지 중 하나인지를 나타냄
		boolean[] nums = new boolean[42];
		//
		for(int i=0; i<10; i++) {
			//나머지 값을 배열의 인덱스로 사용하여 해당 위치의 값을 true로.
			nums[Integer.parseInt(br.readLine())%42] = true;
		}
		int count=0;
		for(boolean value : nums) {
			if(value) {	//value가 true이면
				count++;
			}
		}
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}

}
