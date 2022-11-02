import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class C10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] line2 = new int[2];

        while (true) {
            String[] line = br.readLine().split(" ");
            line2[0] = Integer.parseInt(line[0]);
            line2[1] = Integer.parseInt(line[1]);

            if (line2[0] + line2[1] == 0) {
                break;
            }
            bw.append(String.valueOf(line2[0] + line2[1])).append("\n");
        }
        bw.flush();
    }
}
