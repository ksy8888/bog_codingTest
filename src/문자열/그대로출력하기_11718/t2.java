package 문자열.그대로출력하기_11718;

import java.io.*;
import java.util.*;

public class t2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //BufferedReader의 입력 끝을 확인할 때는 readLine()이 null을 반환할때이다.
        String str;
        while((str = br.readLine()) != null) {
            bw.write(str);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
