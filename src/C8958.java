import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] tc = new String[num];

        for (int i = 0; i < num; i++) {
            tc[i] = br.readLine();
        }

        int count = 1;
        int[] score = new int[num];

        for (int i = 0; i < num; i++) {
            String[] tc2 = tc[i].split("");

            for (int j = 0; j < tc2.length; j++) {
                if (tc2[j].equals("O")) {
                    score[i] += count;
                    count++;
                } else
                    count = 1;
            }
            count = 1;
        }

        for (int i = 0; i < num; i++) {
            System.out.println(score[i]);
        }
    }
}
