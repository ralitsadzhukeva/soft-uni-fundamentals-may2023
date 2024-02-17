package methods_06;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Math.abs(Integer.parseInt(scanner.nextLine()));

        int result=getMultipleOfEvensAndOdds(input);
        System.out.println(result);
    }
    private static int getMultipleOfEvensAndOdds(int number){
        int evenSum = getSumOfEven(number);
        int oddSum = getSumOfOdd(number);
        return evenSum*oddSum;
    }
    private static int getSumOfOdd(int number){
        int oddSum=0;
        while (number!=0){
            int digits=number%10;
            if (digits%2==1){
                oddSum+=digits;
            }
            number/=10;
        }
        return oddSum;
    }
    private static int getSumOfEven(int number){
        int evenSum=0;
        while (number!=0){
            int digits=number%10;
            if (digits%2==0){
                evenSum+=digits;
            }
            number/=10;
        }
        return evenSum;
    }
}
