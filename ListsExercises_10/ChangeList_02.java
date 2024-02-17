package ListsExercises_10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
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
            String[] token = command.split(" ");
            switch (token[0]){
                case "Delete":
                    int numToRemove = Integer.parseInt(token[1]);
                    numbers.remove(Integer.valueOf(numToRemove));
                    break;
                case "Insert":
                    int insertNum=Integer.parseInt(token[1]);
                    int insertIndex=Integer.parseInt(token[2]);
                    numbers.add(insertIndex, insertNum);
                    break;
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }
}
