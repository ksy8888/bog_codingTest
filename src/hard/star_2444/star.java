package hard.star_2444;

import java.io.*;

public class star {
    public static void main(String[] args) throws IOException {
        //1 3 5 7 9 7 5 3 1     // 2xN-1 줄
        //공백4 *  oooo*oooo   5
        //공백3 *  ooo***ooo 4 5 6
        //공백2 *           3 4 5 6
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); // 5
        int loop = (N*2)-1;
        //System.out.println(loop);
        int stars;  //별
        int spaces; //공백

        for(int i=0; i<loop; i++) { //9
            if(i<N) { //위쪽
                spaces = N-i-1;  // 4 3 2 1 // 5
                stars = 2*i+1; //1 3 5 7 9  
            } else {    //i 5  //N 5   // i 6
                spaces = i-N+1;
             //   stars = 2*(2*N-i-1)+1;  
                stars = 2 * (loop - i) - 1; // 7 5 3 1
            } 

            //공백출력
            for(int j=0; j<spaces; j++) {
                bw.write(" ");
            }
            //별 출력
            for(int j=0; j<stars; j++) {
                bw.write("*");
            }

            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
