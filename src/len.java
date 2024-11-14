import java.io.*;

public class len {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();

        int temp = 0;
        for(int i=0; i < word.length(); i++) {
            temp++;
        }
        bw.write(String.valueOf(temp));

        bw.flush();
        bw.close();
    }
}