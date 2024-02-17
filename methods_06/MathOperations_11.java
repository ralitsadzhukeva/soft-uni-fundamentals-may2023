package methods_06;

import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1=Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double num2=Integer.parseInt(scanner.nextLine());
        double result = calculate(num1,operator,num2);
        System.out.printf("%.0f",result);
    }
    private static double calculate (double num1, String operator, double num2){
        double result=0.0;
        switch (operator){
            case "*":
            result=num1*num2;
            break;
            case "+":
                result=num1+num2;
                break;
            case "/":
                result=num1/num2;
                break;
            case "-":
                result=num1-num2;
                break;
            default:
                break;
        }
        return result;
    }
}
