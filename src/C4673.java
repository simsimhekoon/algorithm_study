import java.io.IOException;
import java.util.Arrays;

public class C4673 {
    public static void main(String[] args) throws IOException {
        int[] tc = new int[10000];
        Arrays.fill(tc, 0);

        int[] result = getResult(tc);

        for (int i = 0; i < 10000; i++) {
            if (result[i] == 0) {
                System.out.println(i + 1);
            }
        }
    }

    public static int[] getResult(int[] newTc) {
        for (int i = 0; i < 10000; i++) {
            if (newTc[i] == 0) {
                newTc = selfNum(i + 1, newTc);
            }
        }
        return newTc;
    }

    public static int[] selfNum(int num, int[] newTc) {
        int[] save = new int[4];

        if (num / 1000 != 0) {
            save[0] = num / 1000;
            save[1] = (num % 1000) / 100;
            save[2] = (num % 100) / 10;
            save[3] = num % 10;
            num += save[0] + save[1] + save[2] + save[3];
            if (num > 10000) {
                return newTc;
            }
            newTc[num - 1] = 1;

        } else if (num / 100 != 0) {
            save[0] = num / 100;
            save[1] = (num % 100) / 10;
            save[2] = num % 10;
            num += save[0] + save[1] + save[2];
            newTc[num - 1] = 1;

        } else if (num / 10 != 0) {
            save[0] = num / 10;
            save[1] = num % 10;
            num += save[0] + save[1];
            newTc[num - 1] = 1;
        } else {
            num += num;
            newTc[num - 1] = 1;
        }

        selfNum(num, newTc);

        return newTc;
    }
}
