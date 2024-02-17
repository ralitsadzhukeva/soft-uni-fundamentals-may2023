package AssociativeArraysExercises_12;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, List<String>> results = new LinkedHashMap<>();


        while (!input.equals("exam finished")){
            String username = input.split("-")[0];
            String language = input.split("-")[1];
            String points = input.split("-")[2];
            if (!results.containsKey(username)){
            }

            input= scanner.nextLine();
        }
    }
}
