package hard.wordStudy_1157;

import java.io.*;

public class word2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine(); //zzA
        String input = S.toUpperCase(); //ZZA
        int[] a = new int[26];

        for(int i=0; i<input.length(); i++) { // a.length X => indexOutOf.. Exception 
            a[input.charAt(i)-'A']++;   //1 ..... 2
        }
        
        int max = 0;
        char maxChar = '?';
        boolean isDup = false;

        for(int i=0; i<a.length; i++) {
            if(a[i] > max) {
                max = a[i];
                maxChar = (char)(i + 'A');  /////////
                isDup = false;
            } else if(a[i] == max) {    //////////
                isDup = true;
            }
        }
        
        if(isDup) {
            bw.write('?');
        } else {
            bw.write(String.valueOf(maxChar));
        }

        bw.flush();
        bw.close();
    }
}
