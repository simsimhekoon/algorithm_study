import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String line2 = br.readLine();

        int x = Integer.parseInt(line);
        int y = Integer.parseInt(line2);

        if (x > 0) {
            if (y > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else if (y > 0) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}
