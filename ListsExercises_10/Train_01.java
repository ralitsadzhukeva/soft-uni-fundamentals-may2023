package ListsExercises_10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int max = Integer.parseInt(scanner.nextLine());
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }
            String[] token = command.split(" ");
            if (token[0].equals("Add")) {
                int toAdd = Integer.parseInt(token[1]);
                wagons.add(toAdd);
            } else {
                int toAdd=Integer.parseInt(token[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int people = wagons.get(i);
                        if (people+ toAdd <= max) {
                            wagons.add(i,people+toAdd);
                            wagons.remove(i+1);
                            break;
                    }
                }
            }
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]",""));
    }
}