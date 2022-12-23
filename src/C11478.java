import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class C11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        HashSet hs = new HashSet();
        for(int i = 0; i < line.length() + 1; i++){
            for(int j = i + 1; j < line.length() + 1; j++){
                hs.add(line.substring(i, j));
            }
        }

        System.out.println(hs.size());
    }
}