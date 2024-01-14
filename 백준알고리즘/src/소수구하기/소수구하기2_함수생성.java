package 소수구하기;

import java.io.*;
import java.util.*;

public class 소수구하기2_함수생성 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i=N; i<=M; i++) {
			 if(check(i)) {
				//출력
				 bw.write(String.valueOf(i+"\n"));
			} else {
				//System.out.println("continue..."+i);
				continue;
			}
		}
		bw.flush(); 
		br.close();
	}
	
	public static boolean check(int num) {
		if(num==1) {
			return false;
		} 
		for(int i=2; i<=(int)Math.sqrt(num); i++) {
			//i%2==0
			//소수는 1과 자기 자신 외에는 어떤 수로도 나누어 떨어지지 않는 수를 말함. ***
			//num이 i로 나누어 떨어질 때 false를 반환하라"는 의미로, num이 i로 나누어 떨어진다는 것은 소수가 아니라는 뜻
			if(num%i==0) {	// ***
				return false;
			}
			
		}
		return true;
	}
}
