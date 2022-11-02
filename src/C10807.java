import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String value = "";
        int valueInt = 0;
        int value1 = 0;
        int value2 = 0;
        int valueSume = 0;
        int count = 0;

        value = br.readLine();
        valueInt = Integer.parseInt(value);

        if (valueInt < 10) {
            valueInt *= 10;
        }

        int valueNew = valueInt;

        while (true) {
            count++;

            value1 = valueNew / 10;
            value2 = valueNew % 10;
            valueSume = value1 + value2;
            valueNew = (valueSume % 10) + (value2 * 10);

            if (valueNew == valueInt) {
                break;
            }
        }
        System.out.println(count);
    }
}