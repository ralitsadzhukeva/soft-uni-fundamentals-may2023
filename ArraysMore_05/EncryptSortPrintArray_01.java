package ArraysMore_05;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortPrintArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String[] words = new String[input];

        // read in the strings
        for (int i = 0; i < input; i++) {
            words[i] = scanner.nextLine();
        }

        int[] encrypted = new int[input];

        // encrypt each string
        for (int i = 0; i < input; i++) {
            String word = words[i];
            int sum = 0;
            for (int j = 0; j < word.length(); j++) {
                char letter = word.charAt(j);
                if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' ||
                        letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' ||
                        letter == 'u' || letter == 'U') {
                    sum += letter * word.length();
                } else {
                    sum += letter / word.length();
                }
            }
            encrypted[i] = sum;
        }

        // sort and print the encrypted values
        Arrays.sort(encrypted);
        for (int num : encrypted) {
            System.out.println(num);
        }
    }
}
