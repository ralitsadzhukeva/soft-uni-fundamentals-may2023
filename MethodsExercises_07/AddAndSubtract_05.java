package MethodsExercises_07;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1=Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int result = getResult(num1,num2,num3);
        System.out.println(result);
    }
    private static int getResult (int num1, int num2, int num3){
        return (num1+num2)-num3;
    }
}
