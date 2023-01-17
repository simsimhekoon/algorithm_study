import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C9663 {
    private static int count = 0;
    private static int result = 0;
    private static int chess[];
    private static boolean checkLBRT[];
    private static boolean checkLTRB[];

    public static void main(String[] args) throws IOException {
        System.out.println(getResult(getSize()));
    }

    private static int getSize() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String size = br.readLine();

        return Integer.parseInt(size);
    }

    private static int getResult(int size){
        chess = new int[size];
        checkLBRT = new boolean[size*2];
        checkLTRB = new boolean[size*2];

        setQeen(0);

        return result;
    }

    private static void setQeen(int y){
        for(int i = 0; i < chess.length; i++){
            if(y == chess.length) return;
            if(!checkCanSet(i, y, chess.length)) continue;
            //즉, 아래는 퀸을 놓을 수 있을 경우
            setCheck(i, y, chess.length);
            setQeen(y+1);
            unSetCheck(i, y, chess.length);
        }
    }

    private static boolean checkCanSet(int x, int y, int size){
        return chess[x] == 0 && checkLBRT[x+y] == false && checkLTRB[size-1-y+x] == false;
    }

    private static void setCheck(int x, int y, int size){
        count++;
        chess[x] = y+1;
        //좌하 우상
        checkLBRT[x+y] = true;
        //좌상 우하
        checkLTRB[size-1-y+x] = true;
    }

    private static void unSetCheck(int x, int y, int size){
        if(count == size) result++;
        count--;
        chess[x] = 0;
        //좌하 우상
        checkLBRT[x+y] = false;
        //좌상 우하
        checkLTRB[size-1-y+x] = false;
    }
}
