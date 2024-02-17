package Lists_09;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }
            String[] token = command.split(" ");

            switch (token[0]) {
                case "Contains":
                    int targetNumber = Integer.parseInt(token[1]);
                    if (numbers.contains(targetNumber)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print even":
                    for (int number : numbers) {
                        if (number % 2 == 0) {
                            System.out.print(number + " ");
                        }
                    }
                    System.out.println();
                    break;
                case "Print odd":
                    for (int number : numbers) {
                        if (number % 2 != 0) {
                            System.out.print(number + " ");
                        }
                    }
                    System.out.println();
                    break;
                case "Get sum":
                    int sum = 0;
                    for (int number : numbers) {
                        sum += number;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = token[1];
                    int filterNum = Integer.parseInt(token[2]);
                    for (int number : numbers) {
                        if (conditions(number,condition,filterNum)){
                            System.out.print(number+" ");
                        }
                    }
                    System.out.println();
                    break;
                default:
                    break;
            }
        }
    }
    private static boolean conditions (int number,String condition, int filterNum) {
        switch (condition) {
            case "<":
                return number < filterNum;
            case ">":
                return number > filterNum;
            case "<=":
                return number <= filterNum;
            case ">=":
                return number >= filterNum;
        }
        return false;
    }
}