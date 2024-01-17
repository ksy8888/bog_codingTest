package 배열.나머지;

import java.io.*;
import java.util.HashSet;

public class 나머지_HashSet사용 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			h.add(Integer.parseInt(br.readLine())%42);
		}
		System.out.println(h.size());
	}

}
