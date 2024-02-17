package ArraysExercises_04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int [] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")){
            if (command.contains("swap")){
                int indexOne = Integer.parseInt(command.split(" ")[1]);
                int indexTwo = Integer.parseInt(command.split(" ")[2]);

                int elementOne =numbers[indexTwo];
                int elementTwo = numbers[indexOne];
                numbers[indexOne]=elementOne;
                numbers[indexTwo]=elementTwo;
            } else if (command.contains("multiply")) {
                int indexOne = Integer.parseInt(command.split(" ")[1]);
                int indexTwo = Integer.parseInt(command.split(" ")[2]);

                int elementOne =numbers[indexOne];
                int elementTwo = numbers[indexTwo];

                int product = elementTwo*elementOne;
                numbers[indexOne]=product;
            } else if (command.contains("decrease")) {
                for (int i = 0; i <= numbers.length-1 ; i++) {
                    numbers[i]=numbers[i]-1 ;
                }
            }
            command= scanner.nextLine();
        }
        for (int i = 0; i <= numbers.length-1 ; i++) {
            int current = numbers[i];
            if (i!=numbers.length-1){
                System.out.print(current + ", ");
            }
            else {
                System.out.println(current);
            }
        }
    }
}
