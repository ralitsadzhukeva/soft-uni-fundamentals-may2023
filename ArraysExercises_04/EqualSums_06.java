package ArraysExercises_04;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isEqual = false;

        for (int i = 0; i <= numbers.length - 1; i++) {
            int current = numbers[i];
            int left = 0;
            int right = 0;
            for (int leftIn = 0; leftIn <i; leftIn++) {
                left+=numbers[leftIn];
            }
            for (int rightIn = i+1; rightIn <= numbers.length-1; rightIn++) {
                right+=numbers[rightIn];
            }
            if (left==right){
                System.out.println(i);
                isEqual=true;
                break;
            }
        }
        if (!isEqual){
            System.out.println("no");
        }
    }
}
