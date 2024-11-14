package 아스키코드;
import java.io.*;

public class asci {
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        byte num = (byte)br.readLine().charAt(0);
        bw.write(String.valueOf(num));

        bw.flush();
        bw.close();

    }
}
