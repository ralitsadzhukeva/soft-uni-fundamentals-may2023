package Variables_02;

import java.util.Scanner;

public class ReversedChars_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char sign1 = scanner.nextLine().charAt(0);
        char sign2 = scanner.nextLine().charAt(0);
        char sign3 = scanner.nextLine().charAt(0);
        System.out.printf("%s %s %s",sign3,sign2,sign1);
    }
}
