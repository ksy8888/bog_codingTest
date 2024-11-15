package 문자열.알파벳찾기_10809;
import java.io.*;
public class t2 {
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        // 배열의 모든 요소에 -1을 대입하고 각 알파벳의 개수를 세서 
        int[] cnt = new int[26];
        for(int i = 0; i < 26; i++){
        	cnt[i] = -1;
        }
        for(int i = 0; i < str.length(); i++) {
        	char ch = str.charAt(i);
            if(cnt[ch-'a'] == -1) {
            	cnt[ch-'a'] = i;
            }
        }
        
        for(int i : cnt) {
        	System.out.print(i + " ");
        }
    }
}
