import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class C15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();

        int T = Integer.parseInt(line);

        int[] C2 = new int[2];
        int[] C3 = new int[T];
        String[] C4 = new String[T];

        for (int i = 0; i < T; i++) {
            line = br.readLine();
            String[] C = line.split(" ");
            C2[0] = Integer.parseInt(C[0]);
            C2[1] = Integer.parseInt(C[1]);

            C3[i] = C2[0] + C2[1];
        }

        for (int i = 0; i < T; i++) {
            // System.out.println(C3[i]);
            C4[i] = String.valueOf(C3[i]);
            bw.write(C4[i]);
            bw.newLine();
        }
        bw.close();
    }
}
