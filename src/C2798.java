import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] read = br.readLine().split(" ");
        int valueN = Integer.parseInt(read[0]);
        int valueM = Integer.parseInt(read[1]);

        String[] tc = br.readLine().split(" ");
        int sum = 0;
        int result = 0;

        Loop1: for (int i = 0; i < valueN - 2; i++) {
            for (int j = i + 1; j < valueN - 1; j++) {
                for (int k = j + 1; k < valueN; k++) {
                    sum = Integer.parseInt(tc[i]) + Integer.parseInt(tc[j]) + Integer.parseInt(tc[k]);
                    if (sum == valueM) {
                        result = sum;
                        break Loop1;
                    }
                    if (valueM - sum > 0) {
                        if (result < sum) {
                            result = sum;
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }
}
