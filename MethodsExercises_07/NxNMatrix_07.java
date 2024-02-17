package MethodsExercises_07;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        printMatrix(n);
    }
    public static void printMatrix (int numbers){
        for (int i = 0; i < numbers; i++) {
            for (int j = 0; j < numbers; j++) {
                System.out.print(numbers+" ");
            }
            System.out.println();
        }
    }
}
