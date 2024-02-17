package RegularExpressions_15;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName = scanner.nextLine();

        String regex ="\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";

        Pattern pattern = Pattern.compile(regex);//шаблон
        Matcher matcher = pattern.matcher(fullName);// текстове, които отговарят на шаблона
        //matcher = {"Ivan Ivanov", "Georgi Georgiev"}

        //matcher.find() - > true, ако имаме намерени текстове

        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
