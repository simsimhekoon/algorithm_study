import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C15652 {
    static boolean[] check = new boolean[9];
    static int[] values = new int[9];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tc = br.readLine().split(" ");

        getResult(0, Integer.parseInt(tc[0]), Integer.parseInt(tc[1]));
    }

    public static void getResult(int index, int n, int m){
        if(index == m){ //m개를 모두 골랐다면 출력
            for(int value : values){
                if(value != 0){
                    System.out.print(value + " ");
                }
            }
            System.out.println();
            return;
        }

        for(int i = 1; i <= n; i++){
            //오름차순이 아니라면 다음 숫자로 넘긴다
            if(0 < index && i < values[index - 1]) continue;
            //숫자를 저장한다
            values[index] = i;

            //M개 찾을때까지 반복
            getResult(index + 1, n, m);
        }
    }
}