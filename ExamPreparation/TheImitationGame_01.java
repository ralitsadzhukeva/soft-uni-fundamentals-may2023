package ExamPreparation;

import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder modifyMessage = new StringBuilder(text);
        while (true){
            String[] input = scanner.nextLine().split("\\|");
            if (input[0].equals("Decode")){
                break;
            }
            String command = input[0];
            switch (command){
                case "Move":
                    int letters = Integer.parseInt(input[1]);
                    String firstLetters = modifyMessage.substring(0,letters);
                    modifyMessage.delete(0,letters);
                    modifyMessage.append(firstLetters);
                    break;
                case "Insert":
                    int index = Integer.parseInt(input[1]);
                    String toInsert = input[2];
                    if (index>=0 && index<=modifyMessage.length()) {
                        modifyMessage.insert(index, toInsert);
                    }
                    break;
                case "ChangeAll":
                    String toChange = input[1];
                    String replacement = input[2];
                    String current = modifyMessage.toString();
                    current = current.replace(toChange,replacement);
                    modifyMessage = new StringBuilder(current);
                    break;

            }

        }
        System.out.printf("The decrypted message is: %s",modifyMessage.toString());
    }
}
