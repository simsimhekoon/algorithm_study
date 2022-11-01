import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int N = Integer.parseInt(line); // 테스트 케이스 갯수

        for (int i = 1; i < N + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
