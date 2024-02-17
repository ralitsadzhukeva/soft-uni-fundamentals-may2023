package ListsExercises_10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> firstHand = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List <Integer> secondHand = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while (firstHand.size()!=0 && secondHand.size()!=0){
            int firstHandCard = firstHand.get(0);
            int secondHandCard = secondHand.get(0);
            firstHand.remove(0);
            secondHand.remove(0);

            if (firstHandCard>secondHandCard){
                firstHand.add(firstHandCard);
                firstHand.add(secondHandCard);
            }
            else if (firstHandCard<secondHandCard){
                secondHand.add(secondHandCard);
                secondHand.add(firstHandCard);
            }
        }
        if (firstHand.size()==0){
            System.out.printf("Second player wins! Sum: %d",getSum(secondHand));
        } else if (secondHand.size()==0) {
            System.out.printf("First player wins! Sum: %d",getSum(firstHand));
        }
    }
    private static int getSum (List<Integer> listCards){
        int sum=0;
        for (int card:listCards) {
            sum+=card;
        }
        return sum;
    }
}
