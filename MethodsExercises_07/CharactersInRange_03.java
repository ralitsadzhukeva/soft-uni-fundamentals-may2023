package MethodsExercises_07;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char char1=scanner.nextLine().charAt(0);
        char char2 = scanner.nextLine().charAt(0);

        PrintTheCharsBetweenTwo(char1,char2);
    }
    private static void PrintTheCharsBetweenTwo(char char1, char char2){
        int start =Math.min(char1,char2);
        int end = Math.max(char1,char2);
        for (int i = ++start; i <end ; i++) {
            System.out.print((char)i +" ");
        }
        System.out.println();
    }
}
