import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class C1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");

        String[] set = br.readLine().split(" ");
        HashSet hs1 = new HashSet(Arrays.asList(set));
        set = br.readLine().split(" ");
        HashSet hs2 = new HashSet(Arrays.asList(set));

        int result = hs1.size() + hs2.size();
        hs1.retainAll(hs2);
        result = result-(hs1.size()*2);

        System.out.println(result);
    }
}