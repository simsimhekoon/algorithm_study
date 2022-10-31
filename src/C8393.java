import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int a = Integer.parseInt(line);
        int b = 0;

        for (int i = 0; i < a + 1; i++) {
            b += i;
        }
        System.out.println(b);
    }
}