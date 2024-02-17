package Variables_02;

import java.util.Scanner;

public class MToKM_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters = Integer.parseInt(scanner.nextLine());
        double km =Math.abs(meters/1000);
        System.out.printf("%.2f", km);
    }
}
