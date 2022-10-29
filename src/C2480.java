import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] TIME = line.split(" ");

        int D[] = new int[4];
        int SC = 1;
        int save = 0;

        // 배열에 순서대로 숫자 저장.
        // 마지막은 첫번째와 세번째 수를 비교하기위해 첫번재수 저장.
        for (int i = 0; i < 3; i++) {
            D[i] = Integer.parseInt(TIME[i]);
        }
        D[3] = D[0];

        // 비교해서 같으면 카운트(SC)를 1증가.
        // 비교해서 같으면 숫자 저장(save).
        // SC가 3이면(모든 숫자가 같으면) 세번째와 첫번째를 굳이 비교하지 않고 종료
        for (int i = 0; i < 3; i++) {
            if (D[i] == D[i + 1]) {
                SC++;
                save = D[i];
                if (SC == 3) {
                    break;
                }
            }
        }

        // SC가 1이면 모두다름, 2면 2개같음 3이면 모두같음.
        // SC가 1이면 가장 큰 수를 찾아냄.
        switch (SC) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    if (D[i] < D[i + 1]) {
                        if (save < D[i + 1]) {
                            save = D[i + 1];
                        }
                    }
                }
                System.out.println(save * 100);
                break;

            case 2:
                System.out.println(1000 + (save * 100));
                break;

            case 3:
                System.out.println(10000 + (save * 1000));
                break;
        }
    }
}