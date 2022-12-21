import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class C14425 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] firstLine = br.readLine().split(" ");
//
//        ArrayList al1 = new ArrayList();
//        for(int i = 0; i < Integer.parseInt(firstLine[0]); i++){
//            al1.add(br.readLine());
//        }
//
//        ArrayList al2 = new ArrayList();
//        for(int i = 0; i < Integer.parseInt(firstLine[1]); i++){
//            al2.add(br.readLine());
//        }
//
//        int count = 0;
//        for(int i = 0; i < al2.size(); i++){
//            if(al1.contains(al2.get(i))){
//                count++;
//            }
//        }
//
//        System.out.println(count);


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");



        HashSet<String> hs = new HashSet<String>();
        for(int i = 0; i < Integer.parseInt(firstLine[0]); i++){
            hs.add(br.readLine());
        }

        int count = 0;
        for(int i = 0; i < Integer.parseInt(firstLine[1]); i++){
            if(hs.contains(br.readLine())){
                count++;
            }
        }

        System.out.println(count);

    }
}