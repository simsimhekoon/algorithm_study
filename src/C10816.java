import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class C10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        String num = br.readLine();
        String[] values = br.readLine().split(" ");
        for(int i = 0; i < Integer.parseInt(num); i++){
            if(hm.containsKey(values[i])){
                hm.put(values[i], hm.get(values[i])+1);
            }
            else{
                hm.put(values[i], 1);
            }
        }

        num = br.readLine();
        values = br.readLine().split(" ");
        for(int i = 0; i< Integer.parseInt(num); i++){
            if(hm.containsKey(values[i])){
                sb.append(hm.get(values[i])).append(" ");
            }
            else{
                sb.append("0 ");
            }
        }
        System.out.println(sb);
    }
}