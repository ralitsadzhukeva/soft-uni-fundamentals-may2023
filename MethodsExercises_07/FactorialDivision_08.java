package MethodsExercises_07;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long factorialNum = Integer.parseInt(scanner.nextLine());
        long divideBy = Integer.parseInt(scanner.nextLine());
        double result = calculateFactorial(factorialNum)/calculateFactorial(divideBy);
        System.out.printf("%.2f",result);
    }

    private static double calculateFactorial(long num) {
        double factorial = 1;
        for (int i = 1; i <= num; i++)
            factorial *= i;
        return factorial;
    }
}