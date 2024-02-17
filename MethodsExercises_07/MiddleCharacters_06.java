package MethodsExercises_07;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        getMiddleLetter (word);
    }
    private static void getMiddleLetter (String word){
        int length = word.length();
        int middle = length/2;

        if (word.length()%2==0){
            char middle1 = word.charAt(middle-1);
            char middle2 = word.charAt(middle);
            System.out.printf("%c%c",middle1,middle2);
        }
        else {
            char middleOne = word.charAt(middle);
            System.out.println(middleOne);
        }
    }
}
