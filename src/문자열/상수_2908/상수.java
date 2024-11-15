 package 문자열.상수_2908;
import java.io.*;

public class 상수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String num = br.readLine(); // 734 893
        //String[] AB = num.split(" ");  
        
        String reverse = "";
        for(int i = num.length()-1; i >= 0; i--) {
            reverse = reverse + num.charAt(i);
        }
        
        String[] AB = reverse.split(" "); // 398 437
        int A = Integer.parseInt(AB[0]);
        int B = Integer.parseInt(AB[1]);

        if( A > B) {
            bw.write(String.valueOf(A));
        } else {
            bw.write(String.valueOf(B));
        }

        bw.flush();
        bw.close();

    }
}
