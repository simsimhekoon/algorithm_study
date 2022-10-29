import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int a = Integer.parseInt(line);

        if (a % 400 == 0) {
            System.out.println("1");
        } else if (a % 4 == 0 & a % 100 != 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}