package ArraysExercises_04;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceEqualElements_07   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int length = 1;
        int maxLength=0;

        int index=0;
        int best=0;
        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i]==numbers[i-1]){
                length++;
            }
            else {
                length=1;
                index=i;
            }
            if (length>maxLength){
                maxLength=length;
                best=index;
            }
        }
        for (int i = best; i <best+maxLength ; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
