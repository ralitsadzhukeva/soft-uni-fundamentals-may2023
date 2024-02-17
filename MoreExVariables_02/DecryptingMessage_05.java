package MoreExVariables_02;

import java.util.Scanner;

public class DecryptingMessage_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key= Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());
        String code=" ";
        for (int i = 1; i <=lines ; i++) {
            char letter=scanner.nextLine().charAt(0);
            char realCode= (char) key;
            char result = (char) (realCode + letter);
            code+=result;
            }
        System.out.println(code);

    }
}
