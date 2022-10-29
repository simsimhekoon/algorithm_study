import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String line2 = br.readLine();
        String[] TIME = line.split(" ");

        int H = Integer.parseInt(TIME[0]);
        int M = Integer.parseInt(TIME[1]);
        int P = Integer.parseInt(line2);

        int time = H * 60 + M + P;
        if (time > 1439) {
            time -= 1440;
        }

        System.out.println((time / 60) + " " + (time % 60));
    }
}
