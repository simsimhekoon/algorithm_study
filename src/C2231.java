import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int matchValue = Integer.parseInt(br.readLine());
        String[] splitValue = String.valueOf(matchValue).split("");

        int result = 0;
        int length = 0;
        int now = 0;
        int save = 0;

        if (matchValue < 10) {
            length = 0;
        } else {
            length = matchValue - (splitValue.length * 9);
        }

        for (int i = matchValue; i > length; i--) {
            if (i < 0)
                break;

            now = i;
            save = now;

            String[] splitValue2 = String.valueOf(i).split("");

            for (int j = 0; j < splitValue2.length; j++) {
                now += Integer.parseInt(splitValue2[j]);
            }

            if (now == matchValue) {
                result = save;
            }
        }

        System.out.println(result);
    }

}{

}
