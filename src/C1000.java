import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class C1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] lines = line.split(" ");
        int a = Integer.parseInt(lines[0]);
        int b = Integer.parseInt(lines[1]);

        System.out.println(a + b);
    }
}