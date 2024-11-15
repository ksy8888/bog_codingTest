package 문자열.다이얼_5622;
import java.io.*;

public class 다이얼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String alpha = br.readLine(); //WA
        int cnt = 0;
        for(int i=0; i<alpha.length(); i++) { //2
            switch (alpha.charAt(i)) {
                case 'A': case 'B': case 'C':
                    cnt  += 3;
                    break;
                case 'D': case 'E': case 'F':
                    cnt  += 4;
                    break;
                case 'G': case 'H': case 'I':
                    cnt  += 5;
                    break;
                case 'J': case 'K': case 'L':
                    cnt  += 6;
                    break;
                case 'M': case 'N': case 'O':
                    cnt  += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    cnt  += 8;
                    break;
                case 'T': case 'U': case 'V':
                    cnt += 9;
                    break;
                default:
                    cnt += 10;
                    break;
            }
        }
        
        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
    }
}
