import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class C3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tc = new String[10];

        for (int i = 0; i < 10; i++) {
            tc[i] = br.readLine();
            tc[i] = String.valueOf(Integer.parseInt(tc[i]) % 42);
        }

        // 배열을 HashSet으로 변환
        HashSet<String> hs = new HashSet<>(Arrays.asList(tc));

        // HashSet을 배열로 변환
        String[] result = hs.toArray(new String[0]);

        // 중복이 제거된 배열 출력
        System.out.println(result.length);

    }
}
