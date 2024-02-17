package Arrays_03;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstArr []= Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int secondArr []= Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        boolean notIdentical = false;
        for (int i = 0; i < firstArr.length; i++) {
            sum+=firstArr[i];
            if (firstArr[i] != secondArr[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                notIdentical=true;
                break;
            }
        }
        if (!notIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}