package MidExamPreparation_02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> neighbourhood = Arrays.stream(scanner.nextLine()
                        .split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int current = 0;
        String input = scanner.nextLine();
        while (!input.equals("Love!")) {
            int jumpLength = Integer.parseInt(input.split(" ")[1]);
            current += jumpLength;

            if (current > neighbourhood.size() - 1) {
                current=0;
            }
            if (neighbourhood.get(current)!=0){
                neighbourhood.set(current,neighbourhood.get(current)-2);
                if (neighbourhood.get(current)==0){
                    System.out.printf("Place %d has Valentine's day.%n",current);
                }
            }else {
                System.out.printf("Place %d already had Valentine's day.%n",current);
            }
            input=scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n",current);
        boolean isFailed =false;

        int failedHouses= 0;
        for (int house: neighbourhood) {
            if (house!=0){
                isFailed=true;
                failedHouses++;
            }
        }
        if (isFailed){
            System.out.printf("Cupid has failed %d places.",failedHouses);
        } else {
            System.out.println("Mission was successful.");
        }
    }
}