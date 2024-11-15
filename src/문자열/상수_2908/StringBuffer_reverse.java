package 문자열.상수_2908;
import java.io.*;

public class StringBuffer_reverse {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        String[] temp = S.split(" ");

        // reverse() 는 배열에서 사용X. 배열을 순회하면서 찾아가야함
        StringBuffer reverseA = new StringBuffer(temp[0]).reverse();
        StringBuffer reverseB = new StringBuffer(temp[1]).reverse();
       
        int A = Integer.parseInt(reverseA.toString());
        int B = Integer.parseInt(reverseB.toString());
        
        bw.write(String.valueOf(Math.max(A, B)));

        // for
        // int[] AB = new int[temp.length];
        // for(int i=0; i<temp.length; i++) {
        //     //뒤집기
        //     String reverse = new StringBuilder(AB[i]).reverse().toString();
        //     // 정수 변환
        //     AB[i] = Integer.parseInt(reverse);
        // }
        // bw.write(String.valueOf(Math.max(AB[0], AB[1])));

        // for문으로 max값 비교
        /*
         * int max = AB[0]; //초기값을 첫번째 요소
         * for(int i=1; i<AB.length; i++) {
         *  if(AB[i] > max) {
         *      max = AB[i];
         * }
         * }
         */
        
        bw.flush();
        bw.close();

    }
}
