package TextProcessingExercises_14;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        StringBuilder encrypted= new StringBuilder();

        for (char symbol:sentence.toCharArray()) {

            char encryptedSymbol = (char) (symbol+3);
            encrypted.append(encryptedSymbol);
        }
        System.out.println(encrypted);
    }
}
