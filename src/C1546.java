import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class C1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String tc = br.readLine();

        String[] tc2 = tc.split(" ");
        int[] tc3 = new int[num];

        for (int i = 0; i < num; i++) {
            tc3[i] = Integer.parseInt(tc2[i]);
        }

        Arrays.sort(tc3);

        int max = tc3[num - 1];

        double average = 0;

        for (int i = 0; i < num; i++) {
            average += tc3[i] / (double) max * 100;
        }

        System.out.println(average / num);
    }
}
