import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line, " ", false);

        int min = 1000001;
        int max = -1000001;
        int now = 0;

        for (int i = 0; i < Integer.parseInt(N); i++) {
            now = Integer.parseInt(st.nextToken());
            if (now > max)
                max = now;
            if (now < min)
                min = now;
        }

        System.out.println(min + " " + max);
    }
}
