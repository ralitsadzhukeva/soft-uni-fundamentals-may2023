package introdction_01;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = Integer.parseInt(scanner.nextLine());
        while (true) {
            System.out.printf("%d X %d = %d%n", n, i, n * i);
            i++;
            if (i > 10) {
                break;
            }
        }
    }
}