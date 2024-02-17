package MethodsExercises_07;

import java.util.Scanner;


public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();
        validPassword(pass);
    }

    private static void validPassword(String password) {
        boolean length = false;
        boolean letterDigits =true;
        int digits = 0;
        boolean digits2=false;

        if (password.length() >= 6 && password.length() <= 10) {
            length = true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
        }
        for (int i = 0; i < password.length(); i++) {
            char current = password.charAt(i);

            if ((int) current >= 48 && (int) current <= 57) {
                digits++;
            }
            if ((int)current < 48 || (int)current > 122 || (int)current > 90 && (int)current < 97 || (int)current > 57 && (int)current < 65){
                letterDigits=false;
            }
        }
        if (letterDigits==false){
            System.out.println("Password must consist only of letters and digits");
        }
        if (digits>=2){
            digits2=true;
        } else if (digits<2) {
            System.out.println("Password must have at least 2 digits");
        }
        if (length && digits2 && letterDigits){
            System.out.println("Password is valid");
        }
    }
}