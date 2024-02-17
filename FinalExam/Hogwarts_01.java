package FinalExam;

import java.util.Arrays;
import java.util.Scanner;

public class Hogwarts_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String spell = scanner.nextLine();


        String input = scanner.nextLine();
        int index = 0;
        while (!input.equals("Abracadabra")) {
            String[] inputParts = input.split("\\s+");
            String command = inputParts[0];
            switch (command) {
                case "Abjuration":
                    spell = spell.toUpperCase();
                    System.out.println(spell);
                    break;
                case "Necromancy":
                    spell = spell.toLowerCase();
                    System.out.println(spell);

                    break;
                case "Illusion":
                    index = Integer.parseInt(inputParts[1]);
                    char letter = inputParts[2].charAt(0);
                    if (index >= 0 && index <= spell.length()) {
                        char[] spellArray =spell.toCharArray();
                        spellArray[index]=letter;
                        spell = new String(spellArray);
                        System.out.println("Done!");
                    }
                    else {
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case "Divination":
                    String firstSubstring = inputParts[1];
                    String secondSubstring = inputParts[2];
                    if (spell.contains(firstSubstring)){
                        spell = spell.replace(firstSubstring,secondSubstring);
                    }
                    System.out.println(spell);

                    break;
                case "Alteration":
                    String substring = inputParts[1];
                    if (spell.contains(substring)){
                        spell=spell.replace(substring,"");
                    }
                    System.out.println(spell);

                    break;
                default:
                    System.out.println("The spell did not work!");
                    break;

            }
            input=scanner.nextLine();
        }
    }
}