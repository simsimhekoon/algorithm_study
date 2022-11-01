import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class C15552R {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();

        int T = Integer.parseInt(line); // 테스트 케이스 갯수
        int[] b = new int[2];

        for (int i = 0; i < T; i++) {
            String[] a = br.readLine().split(" ");
            b[0] = Integer.parseInt(a[0]);
            b[1] = Integer.parseInt(a[1]);
            bw.append(String.valueOf(b[0] + b[1])).append("\n");
        }
        bw.flush();
    }
}