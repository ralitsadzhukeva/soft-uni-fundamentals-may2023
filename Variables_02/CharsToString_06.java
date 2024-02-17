package Variables_02;

import java.util.Scanner;

public class CharsToString_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char sign1 = scanner.nextLine().charAt(0);
        char sign2 = scanner.nextLine().charAt(0);
        char sign3 = scanner.nextLine().charAt(0);
        String combined ="" + sign1 + sign2 + sign3;
        System.out.println(combined);
    }
}
