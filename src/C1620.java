import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class C1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = "";

        String[] firstLine = br.readLine().split(" ");

        HashMap hm = new HashMap();
        HashMap hm2 = new HashMap();
        for(int i = 1; i < Integer.parseInt(firstLine[0])+1; i++) {
            line = br.readLine();
            hm.put(String.valueOf(i), line);
            hm2.put(line, String.valueOf(i));
        }

        for(int i = 0; i < Integer.parseInt(firstLine[1]); i++){
            line = br.readLine();
            if(hm.containsKey(line)){ //숫자일경우
                sb.append(hm.get(line)).append("\n");
            }
            else{ //문자열일경우
                sb.append(hm2.get(line)).append("\n");
            }
        }
        System.out.println(sb);
    }
}