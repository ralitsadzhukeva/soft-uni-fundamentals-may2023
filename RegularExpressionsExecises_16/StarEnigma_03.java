package RegularExpressionsExecises_16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attackType>[AD])![^@!:>-]*->(?<soldierCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> attackedList = new ArrayList<>();
        List<String> destroyedList = new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            String text = scanner.nextLine();
            String decrypted  = getDecryptedMessage(text);

            Matcher matcher = pattern.matcher(decrypted);

            if (matcher.find()){
                String planet = matcher.group("planetName");
                String attackType = matcher.group("attackType");

                if (attackType.equals("A")){
                    attackedList.add(planet);
                } else if (attackType.equals("D")) {
                    destroyedList.add(planet);
                }
            }
        }
        System.out.println("Attacked planets: " + attackedList.size());
        Collections.sort(attackedList);
        attackedList.forEach(planet -> System.out.println("-> "+planet));

        System.out.println("Destroyed planets: "+destroyedList.size());
        Collections.sort(destroyedList);
        destroyedList.forEach(planet -> System.out.println("-> " + planet));
    }
    private static String getDecryptedMessage(String encrypted){
        int letterCount = getSpecialLetters(encrypted);
        StringBuilder decrypted = new StringBuilder();
        for (char symbol:encrypted.toCharArray()) {
            char newSymbol = (char)(symbol-letterCount);
            decrypted.append(newSymbol);
        }


        return decrypted.toString();
    }
    private static int getSpecialLetters(String encrypted){
        int lettersCount = 0;
        for (char symbol:encrypted.toCharArray()) {

            switch (symbol){
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                case 's':
                case 't':
                case 'a':
                case 'r':
                    lettersCount++;
                    break;
            }
        }
        return lettersCount;
    }
}
