import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = isHansu(N);

        System.out.println(result);
    }

    public static int isHansu(int n) {
        int count = 0;

        int split[] = new int[3];
        for (int i = 1; i <= n; i++) {
            if (i < 100) {
                count++;
            } else {
                split[0] = i / 100;
                split[1] = (i % 100) / 10;
                split[2] = i % 10;

                if ((split[0] - split[1] == split[1] - split[2])) {
                    count++;
                }
            }
        }
        return count;
    }
}
