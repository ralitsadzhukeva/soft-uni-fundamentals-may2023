package ArraysExercises_04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  [] numbers= scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <rotations ; i++) {
            String end = numbers[0];
            for (int j = 0; j < numbers.length-1; j++) {
                numbers[j]=numbers[1+j];
            }
            numbers[numbers.length-1]=end;
        }
        System.out.println(String.join(" ",numbers));
    }
}