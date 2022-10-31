import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C2480R {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] TIME = line.split(" ");

        int D[] = new int[3];
        int save = 0;

        // 배열에 순서대로 숫자 저장.
        for (int i = 0; i < 3; i++) {
            D[i] = Integer.parseInt(TIME[i]);
        }

        if (D[0] == D[1]) {
            if (D[0] == D[2]) {
                System.out.println(10000 + (D[0] * 1000)); // 모두 같은 경우
            } else {
                System.out.println(1000 + (D[0] * 100)); // 주사위1,2가 같은경우
            }
        } else if (D[1] == D[2] | D[0] == D[2]) {
            System.out.println(1000 + (D[2] * 100)); // 주사위 2,3 이 같거나 1,3이 같은경우
        } else {
            if (D[0] > D[1]) {
                save = D[0];
            } else {
                save = D[1];
            }
            if (save < D[2]) {
                save = D[2];
            }
            System.out.println(save * 100); // 전부 다른경우
        }
    }
}
