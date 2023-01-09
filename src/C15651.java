import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C15651 {
    static boolean[] check = new boolean[9];
    static int[] values = new int[9];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tc = br.readLine().split(" ");

        getResult(0, Integer.parseInt(tc[0]), Integer.parseInt(tc[1]));

        System.out.println(sb);
    }

    public static void getResult(int index, int n, int m){
        if(index == m){ //m개를 모두 골랐다면 출력
            for(int value : values){
                if(value != 0){
                    sb.append(value).append(" ");
                }
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= n; i++){
            //숫자를 저장한다
            values[index] = i;

            //M개 찾을때까지 반복
            getResult(index + 1, n, m);
        }
    }
}