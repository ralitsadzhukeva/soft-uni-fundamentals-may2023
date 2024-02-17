package Variables_02;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int sum = 0;
        boolean isSpecialNum = false;
        for (int n = 1; n <= num; n++) {
            sum = n;
            while (n > 0) {
                total += n % 10;
                n = n / 10;
            }
            if (isSpecialNum = (total == 5) || (total == 7) || (total == 11)) {
                System.out.printf("%d -> True%n", sum);
                total = 0;
                n = sum;
            }
            else {
                System.out.printf("%d -> False%n", sum);
                total = 0;
                n = sum;
            }
        }
    }
}