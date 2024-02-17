package ExamPreparation;

import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String input = scanner.nextLine();
        StringBuilder finalMessage = new StringBuilder(message);
        while (!input.equals("Reveal")) {
            String[] inputParts = input.split(":\\|:");
            String command = inputParts[0];
            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(inputParts[1]);
                        finalMessage.insert(index, " ");
                    System.out.println(finalMessage);

                    break;
                case "Reverse":
                    String substring = inputParts[1];
                    int indexToReverse = finalMessage.indexOf(substring);
                    if (indexToReverse != -1) {
                        String reversedSubstring = new StringBuilder(substring).reverse().toString();
                        finalMessage.delete(indexToReverse, indexToReverse + substring.length());
                        finalMessage.append(reversedSubstring);
                        System.out.println(finalMessage);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String newSub = inputParts[1];
                    String replacement = inputParts[2];
                    String replacedMessage = finalMessage.toString().replace(newSub, replacement);
                    finalMessage = new StringBuilder(replacedMessage);
                    System.out.println(finalMessage);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s",finalMessage);
    }
}
