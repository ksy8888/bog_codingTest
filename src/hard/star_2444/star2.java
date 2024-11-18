package hard.star_2444;

import java.io.*;

public class star2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); // 5

        for(int i=1; i<=N; i++) { // 5
            for(int j=N-1; j>=i; j--) { //4 3 2 1
                bw.write(" ");
            }
            //1 3 5 7 9 // 2*i -1 //1 ~ 5
            for(int k=0; k < 2*i-1; k++) { 
                bw.write("*");
            }
            bw.newLine();
        }
        /// 1 2 3 4
        for(int i=1; i<N; i++) {
            for(int j=0; j<i; j++) {
                bw.write(" ");
            }
            // 7 5 3 1  // 2 * 4 -1 // 2 * 3 - 1
            // 2 * (N-i) - 1
            for(int j=0; j < 2*(N-i)-1; j++) {
                bw.write("*");
            }
            bw.newLine();
        } 

        bw.flush();
        bw.close();

    }
}
