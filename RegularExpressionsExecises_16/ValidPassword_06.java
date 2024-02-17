package RegularExpressionsExecises_16;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "_\\.+(?<password>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
        Pattern pattern = Pattern.compile(regex);




        for (int i = 1; i <=n ; i++) {
            String password = scanner.nextLine();

            Matcher matcher = pattern.matcher(password);
            if (matcher.find()) {
                String passText = matcher.group("password");
                StringBuilder category = new StringBuilder();

                for (char symbol: passText.toCharArray()) {
                    if (Character.isDigit(symbol)){
                        category.append(symbol);
                    }
                }
                if (category.length()==0){
                    System.out.println("Group: default");
                }
                else {
                    System.out.println("Group: " +category.toString());
                }
            }
            else {
                System.out.println("Invalid pass!");
            }
        }
    }
}
