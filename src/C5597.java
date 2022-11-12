import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] submit = new String[28];

        int[] st = new int[30];

        int st1 = 0;
        int st2 = 0;

        for (int i = 0; i < 28; i++) {
            submit[i] = br.readLine();
            st[i] = 0;
        }
        st[28] = 0;
        st[29] = 0;

        for (int i = 0; i < 28; i++) {
            st[Integer.parseInt(submit[i]) - 1] = 1;
        }

        for (int i = 0; i < 30; i++) {
            if (st[i] == 0) {
                if (st1 == 0) {
                    st1 = i + 1;
                } else
                    st2 = i + 1;
            }
        }

        if (st1 > st2) {
            System.out.println(st2);
            System.out.println(st1);
        } else {
            System.out.println(st1);
            System.out.println(st2);
        }
    }
}