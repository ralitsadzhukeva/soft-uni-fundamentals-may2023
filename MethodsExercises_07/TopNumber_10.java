package MethodsExercises_07;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=num ; i++) {
            if (sumIsDivisibleBy8(i) && hasOneDigit(i)){
                System.out.println(i);
            }
        }
    }
    private static boolean sumIsDivisibleBy8 (int number) {
        int sum = 0;
        String numAsString = "" + number;
        for (int i = 0; i < numAsString.length(); i++) {
            int current = Character.getNumericValue(numAsString.charAt(i));
            sum += current;
        }
        return sum % 8 == 0;
    }
    private static boolean hasOneDigit(int number){
        String numAsString = "" + number;
        for (int i = 0; i < numAsString.length(); i++) {
            int current = Character.getNumericValue(numAsString.charAt(i));
            if (current%2!=0){
                return true;
            }
        }
        return false;
    }
}
