package 문자열.문자열반복_2675;

import java.io.*;

public class 문자열반복 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //test case
        int T = Integer.parseInt(br.readLine()); // 2

        for(int i=0; i<T; i++) {
            //반복R , 문자열S  => 얘네를 line 으로 묶어버림
            String line = br.readLine();
            String[] parts = line.split(" "); //공백으로 분리

            int R = Integer.parseInt(parts[0]); //3
            String S = parts[1]; // ABC

            for(int j=0; j < S.length(); j++) {        
                //값부터 저장
                char ch = S.charAt(j);  //A.. B.. C
                for(int k=0; k < R; k++) {
                    bw.write(ch);
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}