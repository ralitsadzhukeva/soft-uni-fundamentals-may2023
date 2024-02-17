package VariablesExercises_02;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int characters = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (char i = 1; i <=characters ; i++) {
            String letter = scanner.nextLine();
            int ascii = letter.charAt(0);
            sum+=ascii;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
