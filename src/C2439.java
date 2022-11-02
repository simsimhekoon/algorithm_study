import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int N = Integer.parseInt(line); // 테스트 케이스 갯수

        for (int i = 1; i < N + 1; i++) {
            for (int j = N - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
