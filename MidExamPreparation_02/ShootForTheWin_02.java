package MidExamPreparation_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] targets = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int count=0;
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int shot = Integer.parseInt(input);
            if (shot >= 0 && shot <= targets.length - 1) {
                int shotTarget = targets[shot];
                for (int i = 0; i < targets.length; i++) {
                    int current = targets[i];
                    if (i != shot && current != -1) {
                        if (current>shotTarget){
                            current-=shotTarget;
                        }else {
                            current+=shotTarget;
                        }
                        targets[i]=current;
                    }
                }
                targets[shot]=-1;
                count++;
            }
            input = scanner.nextLine();
        }
        System.out.print("Shot targets: "+count+" -> ");
        for (int target:targets) {
            System.out.print(target+" ");
        }
    }
}