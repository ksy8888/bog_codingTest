package 문자열.숫자의합_11720;

import java.io.*;

public class 숫자의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //입력받을 수의 갯수
        int N = Integer.parseInt(br.readLine());
        // 숫자를 문자열로 한번에 받음
        String temp = br.readLine();
        int sum = 0;
        for(int i=0; i<N; i++) {
            sum += Character.getNumericValue(temp.charAt(i));
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}