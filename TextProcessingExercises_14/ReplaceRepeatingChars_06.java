package TextProcessingExercises_14;

import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input =scanner.nextLine();
        StringBuilder finalText = new StringBuilder(input);

        for (int i = 0; i < finalText.length()-1; i++) {
            if (finalText.charAt(i)==finalText.charAt(i+1)){
                finalText.deleteCharAt(i+1);
                i--;
            }
        }
        System.out.println(finalText);
    }
}