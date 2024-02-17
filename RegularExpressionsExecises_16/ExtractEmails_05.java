package RegularExpressionsExecises_16;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String userRegex = "[A-Za-z0-9]+[\\.\\-\\_]?[A-Za-z0-9]+";
        String hostRegex = "[A-Za-z]+\\-?[A-Za-z]+(\\.[A-Za-z]+\\-?[A-Za-z])+";
        String fullRegex = userRegex+ "@"+hostRegex;
        Pattern pattern = Pattern.compile(fullRegex);

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
     }

}
