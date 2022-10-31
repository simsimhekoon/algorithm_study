import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int a = Integer.parseInt(line);

        for (int i = 1; i < 10; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }

    }
}