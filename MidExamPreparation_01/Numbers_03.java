package MidExamPreparation_01;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;
        for (int item: numbers) {
            sum+=item;
        }
        double average = sum*1.0/ numbers.size();
        List <Integer> result = new ArrayList<>();
        for (int item:numbers) {
            if (item>average){
                result.add(item);
            }
        }
        Collections.sort(result);
        Collections.reverse(result);
        if (result.size()<=5 && result.size()>1) {
            System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
        } else if (result.isEmpty()) {
            System.out.println("No");
        } else {
            result = result.stream().limit(5).collect(Collectors.toList());
            System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
