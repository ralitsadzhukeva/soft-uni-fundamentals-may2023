package MidExamPreparation_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = Arrays.stream(scanner.nextLine()
                        .split("!"))
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")){
            String[] command = input.split(" ");
            switch (command[0]){
                case "Urgent":
                    if (products.contains(command[1])){
                        break;
                    }
                    else {
                        products.add(0,command[1]);
                    }
                    break;
                case "Unnecessary":
                    if (products.contains(command[1])){
                        products.remove(command[1]);
                    }
                    else {
                        break;
                    }
                    break;
                case "Correct":
                    String oldItem = command[1];
                    String newItem = command[2];
                    if (products.contains(oldItem)){
                        int place = products.indexOf(oldItem);
                        products.set(place,newItem);
                    }
                    break;
                case "Rearrange":
                    if (products.contains(command[1])){
                        products.remove(command[1]);
                        products.add(command[1]);
                    }
                    break;
            }
            input=scanner.nextLine();
        }
        System.out.println(String.join(", ", products));
    }
}
