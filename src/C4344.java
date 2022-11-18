import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] tc = new String[num];

        for (int i = 0; i < num; i++) {
            tc[i] = br.readLine();
        }

        double average = 0;
        double count = 0;
        double[] result = new double[num];

        for (int i = 0; i < num; i++) {
            String[] tc2 = tc[i].split(" ");

            for (int j = 1; j < tc2.length; j++) {
                average += Integer.parseInt(tc2[j]);
            }

            average /= Integer.parseInt(tc2[0]);

            for (int j = 1; j < tc2.length; j++) {
                if (average < Integer.parseInt(tc2[j])) {
                    count++;
                }
            }

            result[i] = count / (tc2.length - 1) * 100;

            System.out.println(String.format("%.3f", result[i]) + "%");
            count = 0;
            average = 0;
        }
    }
}
