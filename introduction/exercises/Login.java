package introduction.exercises;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String pass = "";
        for (int position = user.length() - 1; position >= 0; position--) {
            char currentSymbol = user.charAt(position);
            pass += currentSymbol;
        }
        int countFailed = 0;
        String enteredPass = sc.nextLine();
        while (!enteredPass.equals(pass)) {
            countFailed++;
            if (countFailed == 4) {
                System.out.printf("User %s blocked!", user);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPass = sc.nextLine();
        }
        if (enteredPass.equals(pass)) {
            System.out.printf("User %s logged in.", user);
        }
    }
}