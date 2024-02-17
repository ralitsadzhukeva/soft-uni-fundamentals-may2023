package ListsExercises_10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("End")) {
                break;
            }
            String[] commandParts = command.split(" ");
            String action = commandParts[0];
            switch (action) {
                case "Add":
                    int numToAdd = Integer.parseInt(commandParts[1]);
                        numbers.add(numToAdd);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(commandParts[1]);
                    int indexToInsert = Integer.parseInt(commandParts[2]);

                    if (indexToInsert >= 0 && indexToInsert < numbers.size()) {
                        numbers.add(indexToInsert, numToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(commandParts[1]);
                    if (numToRemove >= 0 && numToRemove < numbers.size()) {
                        numbers.remove(numToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int shiftNum = Integer.parseInt(commandParts[2]);
                    if (commandParts[1].equals("left")) {
                        for (int i = 0; i < shiftNum; i++) {
                            int first = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(first);
                        }
                    } else if (commandParts[1].equals("right")){
                        for (int i = 0; i < shiftNum; i++) {
                            int last = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(0, last);
                        }
                    }
                    break;

            }
        }
        for (int number:numbers){
            System.out.print(number+" ");
        }
    }
}