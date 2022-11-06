import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tc = new String[9];

        for (int i = 0; i < 9; i++) {
            tc[i] = br.readLine();
        }

        int max = 0;
        int count = 0;
        int where = 0;

        for (int i = 0; i < 9; i++) {
            count++;
            if (Integer.parseInt(tc[i]) > max) {
                max = Integer.parseInt(tc[i]);
                where = count;
            }

        }

        System.out.println(max);
        System.out.println(where);
    }
}
