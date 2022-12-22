import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class C1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] firstLine = br.readLine().split(" ");

        HashSet hs = new HashSet();
        HashSet hs2 = new HashSet();
        for(int i = 0; i < Integer.parseInt(firstLine[0]); i++){
            hs.add(br.readLine());
        }
        for(int i = 0; i < Integer.parseInt(firstLine[1]); i++){
            hs2.add(br.readLine());
        }

        hs.retainAll(hs2);

        ArrayList al = new ArrayList<>(hs);
        Collections.sort(al);

        sb.append(al.size()).append("\n");
        for(int i = 0; i < al.size(); i++){
            sb.append(al.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}