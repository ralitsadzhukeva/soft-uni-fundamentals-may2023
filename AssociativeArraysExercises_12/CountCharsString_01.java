package AssociativeArraysExercises_12;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        Map<Character, Integer> count = new LinkedHashMap<>();
        for (char symbol:word.toCharArray()) {
            if (symbol==' '){
                continue;
            }
            if (count.containsKey(symbol)){
                int current = count.get(symbol);
                count.put(symbol,current+1);
            }
            else {
                count.put(symbol,1);
            }
        }
        for (Map.Entry<Character,Integer> entry :count.entrySet()){
            System.out.println(entry.getKey()+" -> " + entry.getValue());
        }
    }
}
