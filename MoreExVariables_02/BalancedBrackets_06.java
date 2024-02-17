package MoreExVariables_02;

import java.util.Scanner;

public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        int opening = 0;
        int closing = 0;
        for (int i = 0; i < lines; i++) {
            String sign = scanner.nextLine();
            if (sign.equals("(")) {
                opening++;
            } else if (sign.equals(")")) {
                closing++;
                if (opening - closing != 0) {
                    System.out.println("UNBALANCED");
                    return;
                }
            }
        }
            if (opening == closing) {
                System.out.println("BALANCED");
            } else {
                System.out.println("UNBALANCED");
        }
    }
}
