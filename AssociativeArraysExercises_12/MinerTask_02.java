package AssociativeArraysExercises_12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> resources = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (resources.containsKey(input)) {
                int currentQuantity = resources.get(input);
                resources.put(input, currentQuantity + quantity);
            } else {
                resources.put(input, quantity);
            }

            input = scanner.nextLine();
        }
        resources.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}
