package hard.croatia_2941;

import java.io.*;

public class croatia {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try {
            String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
            String input = br.readLine();  // 예: nljj
            int cnt = input.length(); // 입력 문자열의 길이

            // 크로아티아 알파벳을 처리
            for (String str : cro) {
                int index = input.indexOf(str); //indexOf(str) -> 값 없으면 -1 반환
                while (index != -1) {
                    cnt--; // 크로아티아 알파벳 하나를 찾을 때마다 길이를 줄임
                    index = input.indexOf(str, index+1); // 다음 크로아티아 알파벳 위치 찾기
                }
            }  

            // 결과를 BufferedWriter를 사용하여 출력
            bw.write(String.valueOf(cnt)); // cnt 값을 문자열로 변환하여 출력
            bw.newLine(); // 줄 바꿈 추가 (선택 사항)
            bw.flush(); // 출력 버퍼를 비우기
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            bw.close(); // BufferedWriter 닫기
        }
    }
}
