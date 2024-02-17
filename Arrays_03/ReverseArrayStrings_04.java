package Arrays_03;

import java.util.Scanner;

public class ReverseArrayStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line [] = scanner.nextLine().split(" ");
        for (int i = 0; i < line.length; i++) {

        }
        for (int i =line.length - 1; i >=0; i--) {
            System.out.print(line[i] + " ");
        }
    }
}
