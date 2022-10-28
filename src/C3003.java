import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C3003 {
    public static final int[] a = { 1, 1, 2, 2, 2, 8 };

    public static void main(String[] args) throws IOException {
        int[] b = new int[6];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] lines = line.split(" ");

        for (int i = 0; i < 6; i++) {
            a[i] = a[i] - (b[i] = Integer.parseInt(lines[i]));
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
