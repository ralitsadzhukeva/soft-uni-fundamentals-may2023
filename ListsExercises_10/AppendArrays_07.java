package ListsExercises_10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List <String> separatedNumbers = Arrays.stream(input.split("\\|"))
                .collect(Collectors.toList());
        Collections.reverse(separatedNumbers);
        System.out.println(separatedNumbers.toString()
                .replace("[", " ")
                .replace("]"," ")
                        .trim()
                .replaceAll(",", " ")
                .replaceAll("\\s+"," "));
    }
}
