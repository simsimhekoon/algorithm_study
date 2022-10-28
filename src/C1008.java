import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] lines = line.split(" ");
        double a = Integer.parseInt(lines[0]);
        double b = Integer.parseInt(lines[1]);

        System.out.println(a / b);
    }
}