import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C15650 {
    static boolean[] check = new boolean[9];
    static int[] values = new int[9];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

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
            //이미 탐색한 숫자라면 다음 숫자로 넘긴다
            if(check[i]) continue;
            //오름차순이 아니라면 다음 숫자로 넘긴다
            if(0 < index && i <= values[index - 1]) continue;

            //탐색한 숫자가 아니라면 true로 변환
            check[i] = true;
            //숫자를 저장한다
            values[index] = i;

            //M개 찾을때까지 반복
            getResult(index + 1, n, m);

            //M개 찾은 후 결과를 출력하고 return으로 빠져나오면 한 단계씩 false로 초기화
            check[i] = false;
        }
    }
}
