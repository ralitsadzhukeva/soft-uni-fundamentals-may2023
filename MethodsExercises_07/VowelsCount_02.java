package MethodsExercises_07;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] word = scanner.nextLine().split("");
        int counter = 0;

        for (int i = 0; i <word.length ; i++) {
            if (word[i].equals("a")||word[i].equals("A")){
               counter++;
            } else if (word[i].equals("e")||word[i].equals("E")) {
                counter++;
            } else if (word[i].equals("o")||word[i].equals("O")) {
                counter++;
            } else if (word[i].equals("i")||word[i].equals("I")) {
                counter++;
            } else if (word[i].equals("u")||word[i].equals("U")) {
                counter++;
            }
        }
        System.out.println(counter);
    }

}
