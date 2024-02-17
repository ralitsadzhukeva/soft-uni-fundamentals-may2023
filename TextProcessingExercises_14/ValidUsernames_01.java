package TextProcessingExercises_14;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        String[] usernames =input.split(", ");

        for (String username:usernames) {
            if (isValid(username)) {
                System.out.println(username);
            }
        }

    }
    public static boolean isValid(String username){
        if (username.length()<3 || username.length()>16){
            return false;
        }
        for (char symbol:username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol!='-' && symbol!='_'){
                return false;
            }
        }
        return true;
    }
}
