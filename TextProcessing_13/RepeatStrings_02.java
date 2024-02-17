package TextProcessing_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        ArrayList<String> result= new ArrayList<>();


        for (int i = 0; i < input.length; i++) {
            String current = input[i];
            String repeatWord = repeatString(current);

            result.add(repeatWord);
        }
        System.out.println(String.join("",result));

    }
    public static String repeatString(String input){
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            result+=input;
        }
        return result;
    }
}
