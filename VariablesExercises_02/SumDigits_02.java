package VariablesExercises_02;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = Integer.parseInt(scanner.nextLine());
        while (n!=0){
            int digit = n%10;
            sum+=digit;
            n/=10;
        }
        System.out.println(sum);
    }
}
