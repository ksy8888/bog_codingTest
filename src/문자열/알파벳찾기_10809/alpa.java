package 문자열.알파벳찾기_10809;

import java.io.*;

public class alpa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine(); //abcd
        for(char i = 'a'; i <= 'z'; i++) {
            bw.write(String.valueOf(S.indexOf(i)+" "));
        }

        bw.flush();
        bw.close();
    }
}
