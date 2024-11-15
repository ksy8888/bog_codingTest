package 문자열.단어의개수_1152;

import java.io.*;

public class 단어의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine().trim();
        //String[] temp = S.split(" "); // split으로 자르면 temp가 공백으로만 이루어진 요소를 포함.

        // trim()으로 문자열의 양끝 공백을 제거 후
        //  .split("\\s+")로 연속된 공백을 처리.

        if(S.isEmpty()) {
            bw.write("0");
        } else {
            String[] temp = S.split("\\s+"); // 연속된 공백 처리
            bw.write(String.valueOf(temp.length));
        }

        bw.flush();
        bw.close();
    }
}