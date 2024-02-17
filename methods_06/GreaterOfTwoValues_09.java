package methods_06;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        switch (command) {
            case "int":
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
                int resultInt = getMax(num1, num2);
                System.out.println(resultInt);
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                char charResult = getMax(firstChar, secondChar);
                System.out.println(charResult);
                break;
            case "string":
                String stringOne = scanner.nextLine();
                String stringTwo = scanner.nextLine();
                String stringResult = getMax(stringOne, stringTwo);
                System.out.println(stringResult);
                break;
        }
    }

    private static int getMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }
    private static char getMax(char firstChar, char secondChar){
        if (firstChar>secondChar){
            return firstChar;
        }
        return  secondChar;
    }
    private static String getMax(String stringOne, String stringTwo){
        int first=stringOne.compareTo(stringTwo);
        if (first>=0){
            return stringOne;
        }
        return stringTwo;
    }
}
