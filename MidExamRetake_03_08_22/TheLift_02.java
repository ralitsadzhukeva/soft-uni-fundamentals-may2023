package MidExamRetake_03_08_22;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waiting = Integer.parseInt(scanner.nextLine());
        int [] lift =Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < lift.length; i++) {
            if (lift[i]<4){
                if (waiting>=4-lift[i]){

                }
            }
        }
    }
}
