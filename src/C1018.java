import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer size = new StringTokenizer(br.readLine(), " ");
        int Y = Integer.parseInt(size.nextToken());
        int X = Integer.parseInt(size.nextToken());

        Boolean[][] testCase = new Boolean[Y][X];

        // 테스트케이스를 boolean으로 변환
        for (int i = 0; i < Y; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < X; j++) {
                if (line[j].equals("W")) {
                    testCase[i][j] = true;
                } else {
                    testCase[i][j] = false;
                }
            }
        }

        int count = 0;
        int result = 64;

        for (int x = 0; x < X - 7; x++) {
            for (int y = 0; y < Y - 7; y++) {
                count = match(x, y, testCase, true);
                if (count < result) {
                    result = count;
                }
                count = match(x, y, testCase, false);
                if (count < result) {
                    result = count;
                }
            }
        }

        System.out.println(result);

    }

    public static int match(int X, int Y, Boolean[][] tc, Boolean bool) {
        int count = 0;

        for (int y = Y; y < Y + 8; y++) {
            for (int x = X; x < X + 8; x++) {
                if (tc[y][x] != bool) {
                    count++;
                }

                if (x == X + 7) {
                    break;
                }

                if (bool == true) {
                    bool = false;
                } else {
                    bool = true;
                }
            }
        }

        return count;
    }

}
