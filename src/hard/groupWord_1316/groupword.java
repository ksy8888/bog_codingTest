package hard.groupWord_1316;

import java.io.*;
import java.util.*;

public class groupword {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
       // String[] temp = new String[N];
        
        int groupword = 0;

        for(int i=0; i<N; i++) {
           //temp[i] = br.readLine(); 
            String S = br.readLine();
            if(isGroup(S)) {
                groupword++;
            }
        }
        System.out.println(groupword);
        
    } 

        private static boolean isGroup(String S) {
            //이미 본 문자 => HashSet은 중복허용X
            HashSet<Character> seen = new HashSet<>();
            //이전 문자 초기화
            char previous = '\0';

            for(char c : S.toCharArray()) { 
                //현재문자와 이전 문자가 다르고, 현재문자가 이미 등장했다면 그룹단어가 아니다.
                if(c != previous && seen.contains(c)) {
                    return false;
                }
                seen.add(c);    //seen: {h} , seen: {h,a}
                previous = c; //문자열 순회하면서 이전 문자를 기록하여 현재 문자와 비교하기 위함
            }
            return true;
        }
        
    }
