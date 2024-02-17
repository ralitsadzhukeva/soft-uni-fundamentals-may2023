package ArraysExercises_04;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int goal=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= numbers.length-1 ; i++) {
            int current = numbers[i];
            for (int j = i+1; j <=numbers.length-1 ; j++) {
                int possible = numbers[j];

                if (current+possible==goal){
                    System.out.println(current + " " + possible);
                }
            }
        }
    }
}
