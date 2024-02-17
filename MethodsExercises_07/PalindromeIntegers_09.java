package MethodsExercises_07;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){
            boolean integerIsPalindrome = NumberIsPalindrome(input);
            if (integerIsPalindrome){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input=scanner.nextLine();
        }
    }

    private static boolean NumberIsPalindrome (String input){
        int num = Integer.parseInt(input);
        boolean result=false;

        if (num>=0 && num<=9){
            result=true;
        }
        else {
            char[] digits = input.toCharArray();
            int left = 0;
            int right = digits.length - 1;

            while (left < right) {
                if (digits[left] == digits[right]) {
                    left++;
                    right--;
                } else {
                    result = false;
                    break;
                }
            }

            if (left >= right) {
                result = true;
            }
        }

        return result;
    }
}
