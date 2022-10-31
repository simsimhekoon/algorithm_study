import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int a = Integer.parseInt(line);
        String[] T = new String[a];
        int[] T3 = new int[2];

        for (int i = 0; i < a; i++) {
            T[i] = br.readLine();
        }

        for (int i = 0; i < a; i++) {
            String[] T2 = T[i].split(" ");
            T3[0] = Integer.parseInt(T2[0]);
            T3[1] = Integer.parseInt(T2[1]);

            System.out.println(T3[0] + T3[1]);
        }
    }
}
