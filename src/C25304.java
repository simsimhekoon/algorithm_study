import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int X = Integer.parseInt(line);

        line = br.readLine();
        int N = Integer.parseInt(line);

        int[] T2 = new int[2];
        int X2 = 0;

        for (int i = 0; i < N; i++) {
            line = br.readLine();
            String[] T = line.split(" ");
            T2[0] = Integer.parseInt(T[0]);
            T2[1] = Integer.parseInt(T[1]);

            X2 += T2[0] * T2[1];
        }

        if (X == X2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
