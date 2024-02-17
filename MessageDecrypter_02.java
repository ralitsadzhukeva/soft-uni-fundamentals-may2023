package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDecrypter_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "^([$|%])(?<tag>[A-Z][a-z]{2,})(\\1): \\[(?<firstNumber>\\d+)\\]\\|\\[(?<secondNumber>\\d+)\\]\\|\\[(?<thirdNumber>\\d+)\\]\\|$";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 1; i <= n; i++) {
            String messages = scanner.nextLine();
            Matcher matcher = pattern.matcher(messages);

            if (matcher.find()) {
                String tag = matcher.group("tag");
                StringBuilder decrypted = new StringBuilder();

                decrypted.append((char) Integer.parseInt(matcher.group("firstNumber")));
                decrypted.append((char) Integer.parseInt(matcher.group("secondNumber")));
                decrypted.append((char) Integer.parseInt(matcher.group("thirdNumber")));

                System.out.printf("%s: %s%n", tag, decrypted.toString());
            } else {
                System.out.println("Valid message not found!");
            }
        }
    }
}
