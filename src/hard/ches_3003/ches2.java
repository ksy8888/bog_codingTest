package hard.ches_3003;
import java.io.*;
import java.util.*;

public class ches2 {
    public static void main(String[] args) throws IOException {
        // 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
        // 1 1 2 2 2 8
    //입력 0 1 2 2 2 7 => 1 0 0 0 0 1
    //입력 2 1 2 1 2 1 =>  -1 0 0 1 0 7
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] origin = {1,1,2,2,2,8};
    int[] input = new int[6];

    int[] temp = new int[6];

    for(int i=0; i<input.length; i++) {
        input[i] = Integer.parseInt(st.nextToken());
    }   // 0 1 2 2 2 7

    for(int i=0; i<origin.length; i++) {
        temp[i] = origin[i] - input[i];
    }

    for(int result : temp) {
        bw.write(String.valueOf(result)+" ");
    }
    bw.flush();
    bw.close();

    }
}
