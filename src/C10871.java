import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class C10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String value1 = br.readLine();
        String value2 = br.readLine();

        String[] values1 = value1.split(" ");
        String[] values2 = value2.split(" ");

        int[] value1Int = new int[2];
        value1Int[0] = Integer.parseInt(values1[0]);
        value1Int[1] = Integer.parseInt(values1[1]);

        int[] values2Int = new int[value1Int[0]];

        for (int i = 0; i < value1Int[0]; i++) {
            values2Int[i] = Integer.parseInt(values2[i]);

            if (value1Int[1] > values2Int[i]) {
                bw.append(String.valueOf(values2Int[i]));
                bw.append(" ");
            }
        }
        bw.flush();
    }
}