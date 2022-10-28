import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int YYYY = Integer.parseInt(line);

        System.out.println(YYYY - 543);
    }
}