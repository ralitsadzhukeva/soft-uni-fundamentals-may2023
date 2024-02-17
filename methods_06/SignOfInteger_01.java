package methods_06;

import java.util.Scanner;

public class SignOfInteger_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        PrintSign(num);
    }

    public static void PrintSign(int num) {

        if (num>0){
            System.out.printf("The number %d is positive.",num);
        } else if (num==0) {
            System.out.printf("The number %d is zero.", num);
        }
        else {
            System.out.printf("The number %d is negative.",num);
        }
    }
}
