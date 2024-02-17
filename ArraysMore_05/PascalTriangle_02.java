package ArraysMore_05;

import java.util.Scanner;

public class PascalTriangle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rows; i++) {
            int lines=1;
            for (int j = 1; j <=i; j++) {
                System.out.print(lines+" ");
                lines=lines*(i-j)/j;
            }
            System.out.println();
        }
    }
}
