package ListsExercises_10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String []data = scanner.nextLine().split(" ");
        int bombNum=Integer.parseInt(data[0]);
        int power = Integer.parseInt(data[1]);

        while (numbers.contains(bombNum)){
            int numIndex = numbers.indexOf(bombNum);

            int left = Math.max(0,numIndex-power);
            int right = Math.min(numIndex+power, numbers.size()-1);

            for (int i = right; i >=left ; i--) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
    }
}
