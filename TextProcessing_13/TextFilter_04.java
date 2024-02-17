package TextProcessing_13;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWords:bannedWords) {
            if (text.contains(banWords)){
                String newText = repeatStr("*",banWords.length());
                text = text.replace(banWords,newText);
            }
        }
        System.out.println(text);
    }
    private static String repeatStr(String input,int length){
        String newText ="";
        for (int i = 0; i < length; i++) {
            newText+=input;
        }
        return newText;
    }
}
