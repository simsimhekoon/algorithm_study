import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class C10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        int[] line3 = new int[2];

        while ((line = br.readLine()) != null) {
            String[] line2 = line.split(" ");
            line3[0] = Integer.parseInt(line2[0]);
            line3[1] = Integer.parseInt(line2[1]);

            bw.append(String.valueOf(line3[0] + line3[1])).append("\n");
        }
        bw.flush();
    }
}
