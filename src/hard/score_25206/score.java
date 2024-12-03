package hard.score_25206;

import java.io.*;
import java.util.*;

public class score {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalScore = 0.0; //총점수
        double totalCredits = 0.0; //총학점
        int N = 20;

        for(int i=0; i<N; i++) {
            String[] input = br.readLine().split(" "); //
            String subject = input[0];
            double credits = Double.parseDouble(input[1]);
            String grade = input[2];

            double score = 0.0;
            switch (grade) {
                case "A+": score = 4.5; break;
                case "A0": score = 4.0; break;
                case "B+": score = 3.5; break;
                case "B0": score = 3.0; break;
                case "C+": score = 2.5; break;
                case "C0": score = 2.0; break;
                case "D+": score = 1.5; break;
                case "D0": score = 1.0; break;
                case "F": score = 0.0; break;
                case "P": continue;
            }

            totalScore += score * credits;
            totalCredits += credits;
            
        }
        double result = totalScore / totalCredits;
        System.out.printf("%.6f\n",result);
    }
}