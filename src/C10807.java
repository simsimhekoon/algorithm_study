import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String value = br.readLine();
        int valueInt = Integer.parseInt(value);

        String[] values = br.readLine().split(" ");
        int[] valuesInt = new int[valueInt];

        String value2 = br.readLine();
        int value2Int = Integer.parseInt(value2);

        int count = 0;

        for (int i = 0; i < valueInt; i++) {
            valuesInt[i] = Integer.parseInt(values[i]);
            if (valuesInt[i] == value2Int) {
                count++;
            }
        }
        System.out.println(count);
    }
}