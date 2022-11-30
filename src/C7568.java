import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tcNum = Integer.parseInt(br.readLine());
        Person[] persons = new Person[tcNum];
        int[] score = new int[tcNum];

        for (int i = 0; i < tcNum; i++) {
            String[] splitWH = br.readLine().split(" ");
            persons[i] = new Person(Integer.parseInt(splitWH[0]), Integer.parseInt(splitWH[1]));
        }

        for (int i = 0; i < tcNum; i++) {
            for (int j = 0; j < tcNum; j++) {
                if (persons[i].weight < persons[j].weight) {
                    if (persons[i].height < persons[j].height) {
                        score[i]++;
                    }
                }
            }
            sb.append((score[i] + 1) + " ");
        }

        System.out.println(sb);

    }

    static class Person {
        private int weight;
        private int height;

        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }
    }
}
