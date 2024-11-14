import java.io.*;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine(); //Sprout //012345
		int I = Integer.parseInt(br.readLine()); //3
		
		for(int i=1; i<=S.length(); i++) {
			if(i == I) {
				System.out.println(S.substring(I-1,I));
			}
		}
	}

}