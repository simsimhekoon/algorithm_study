import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class C10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cardNum = Integer.parseInt(br.readLine());
        String[] cardValues = br.readLine().split(" ");
        HashSet<String> s1 = new HashSet<>(Arrays.asList(cardValues));

        int matchNum = Integer.parseInt(br.readLine());
        String[] matchValues = br.readLine().split(" ");
        HashSet<String> s2 = new HashSet<>(Arrays.asList(matchValues));

        s1.retainAll(s2);

        for(int i =0; i < matchNum; i++){
            if (s1.contains(matchValues[i])){
                sb.append("1 ");
            }else{
                sb.append("0 ");
            }
        }

        System.out.println(sb);
    }
}