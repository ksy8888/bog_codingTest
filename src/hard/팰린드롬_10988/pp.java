package hard.팰린드롬_10988;

import java.io.*;

public class pp {
    public static void main(String[] args) throws IOException {
        // 문자입력 -> 문자길이/2 번째를 기준으로, 양끝이 같은지 확인
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        int result =1;

        // 문자열 길이가 홀수 or 짝수
        for(int i=0; i<S.length()/2; i++) {   //noon    //level
            /////
            if(S.charAt(i) != S.charAt(S.length()-i-1)) {
                //bw.write(String.valueOf(0)); => 값비교하면서 계속 0 찍음. 
                result = 0; // 값을 위에서 초기화하고 바꿔주는 형식으로 사용
            } 
            
        }
        bw.write(String.valueOf(result));
    
        bw.flush();
        bw.close();

    }
}
