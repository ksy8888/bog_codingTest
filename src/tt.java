import java.io.*;
public class tt {
    public static void main(String[] args) throws IOException {   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //테스트 케이스 입력
        int tcase = Integer.parseInt(br.readLine());

        //주어진 문자열 첫글자, 마지막 글자를 연속하여 출력
        for(int i=0; i < tcase; i++) {
            String inputString = br.readLine();
            bw.write(inputString.charAt(0)+""+inputString.charAt(inputString.length() - 1));
            bw.newLine();

        }
        bw.flush();
        bw.close();
    }
}
