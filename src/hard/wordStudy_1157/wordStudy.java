package hard.wordStudy_1157;

import java.io.*;
import java.util.*;

public class wordStudy {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력받은 문자열을 배열 0으로 초기화
        // 숫자 나오면 1로 변경
        String S = br.readLine();   //zZa

        // 출력값 대문자. 따라서 대소문자 구별 안하려면 대문자로 변환
        S = S.toUpperCase();    //ZZA

        int[] cnt = new int[26];
        for(int i=0; i < S.length(); i++) {
            cnt[S.charAt(i) -'A']++;    //Z => cnt[25]
        }

        int max = 0;
        char maxChar = '?';
        // 중복 여부 확인
        boolean isDuplicate = false;
// AABBBCC 일때 cnt =[2, 3, 2, ..0]
        for(int i=0; i<cnt.length; i++) {
            if(cnt[i] > max) {
               max = cnt[i];
               maxChar = (char)(i + 'A');   //배열 인덱스 i를 문자로 변환하기위함.
               isDuplicate = false;
            } else if(cnt[i] == max) {
                isDuplicate = true; 
                //i가 2 일 때, 2 == 3 으로 아무런 변화가 없음으로, isDuplicate는 여전히 false.
            }
        }

        if(isDuplicate) {
            bw.write('?');
        } else {
            bw.write(String.valueOf(maxChar));
        }
        
        bw.flush();
        bw.close();
    
    }
    
}
