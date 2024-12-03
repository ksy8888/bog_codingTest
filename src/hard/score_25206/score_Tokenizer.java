package hard.score_25206;

import java.io.*;
import java.util.*;

public class score_Tokenizer {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S;
        double totalScore = 0.0; //총점수
        double totalCredits = 0.0; //총학점

        for(int i=0; i<20; i++) {
            S = br.readLine();
            StringTokenizer st = new StringTokenizer(S, " ");
            // Tokenizer 안쓰고 split을 쓰려면 
            //split 메서드는 String 배열을 반환함 -> 배열값으로 저장해야함. (score.java)
            // String input = br.readLine().split(" ");
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            //P 면 건너뜀
            if(check_pass(grade.equals("P"))) {
                totalCredits += score * check_grade(grade);
                totalScore += score;
            }
        }
        System.out.printf("%.6f\n",totalCredits / totalScore);
    }
    static boolean check_pass(boolean p) {
        // "P" 인 경우 false 반환 그 외에 true 반환 // !는 연산자
        return !p;
    }
    static double check_grade(String grade) {
        switch(grade) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            default: return 0.0;
            
        }
    }
}
