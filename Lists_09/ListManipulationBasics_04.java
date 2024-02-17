package Lists_09;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while (true){
            String command = scanner.nextLine();
            if (command.equals("end")){
                break;
            }
            String[] token=command.split(" ");
            switch (token [0]){
                case "Add":
                    int numToAdd = Integer.parseInt(token[1]);
                    numbers.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(token[1]);
                    numbers.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(token[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert":
                    int insertNum=Integer.parseInt(token[1]);
                    int insertIndex=Integer.parseInt(token[2]);
                    numbers.add(insertIndex, insertNum); // Corrected line
                    break;
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));

    }
}
