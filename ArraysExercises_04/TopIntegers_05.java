package ArraysExercises_04;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isTop=false;
        for (int i = 0; i <= numbers.length-1; i++) {
            int current = numbers[i];
            if (i == numbers.length - 1) {
                System.out.print(current + " ");
                break;
            }
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                int nextNum = numbers[j];
                if (current > nextNum) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(current + " ");
            }
        }
    }
}
