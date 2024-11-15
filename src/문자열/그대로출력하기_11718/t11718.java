package 문자열.그대로출력하기_11718;

import java.io.*;

public class t11718 {
    public static void main(String[] args) throws IOException {
        //빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //StringTokenizer st = new StringTokenizer(br.readLine());
        
        // String[] str = br.readLine().split("\n");   //br.readLine()은 한번의 호출로 한번만 읽는다.
        //     if(str != null && !str.equals("")) {
        //         for(String list : str) {
        //             bw.write(list.trim());
        //         }
        //     }
        
        String str;
        while((str = br.readLine()) != null) {
            bw.write(str);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
