import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String line2 = br.readLine();

        int A = Integer.parseInt(line1);
        int B = Integer.parseInt(line2);

        String[] lines = line2.split("");
        int B_a = Integer.parseInt(lines[0]);
        int B_b = Integer.parseInt(lines[1]);
        int B_c = Integer.parseInt(lines[2]);

        System.out.println(A * B_c);
        System.out.println(A * B_b);
        System.out.println(A * B_a);
        System.out.println(A * B);

    }
}
