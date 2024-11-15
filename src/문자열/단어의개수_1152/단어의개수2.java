package 문자열.단어의개수_1152;

import java.io.*;

//이 코드가 처리시간이 더 짧았음.
public class 단어의개수2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        String[] temp = S.split(" ");
       
        int cnt = 0;
        for(int i=0; i<temp.length; i++) {
            if(temp[i] != "") {   // " " 로 하면 안됨.위에서 split으로 잘랐기 때문.
                cnt ++;
            }
        }
        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
    }
}