package 소수구하기;

import java.io.*;
import java.util.*;

public class 소수구하기_1929 {
	//입력에서 빈 칸을 사이에 두고 주어짐 >> StringTokenizer 사용 >> 사용안하면 NumberFormatException 발생
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
		int a=3;
		System.out.println(Math.sqrt(a)); //4.0
		
		for(int i=2; i<=(int)Math.sqrt(a); i++) {
			//i%2==0
			//num이 i로 나누어 떨어질 때 false를 반환하라"는 의미로, num이 i로 나누어 떨어진다는 것은 소수가 아니라는 뜻
			//System.out.println(i+"번째 루프일때의 :"+num);
			System.out.println("Hello");
			
		}
		
		}
}
