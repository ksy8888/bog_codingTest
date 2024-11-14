import java.io.InputStreamReader;
import java.io.Reader;

public class asci2 {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new InputStreamReader(System.in)) {
            System.out.println(reader.read());
        }
    }
}
