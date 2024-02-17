package ArraysExercises_04;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = Integer.parseInt(scanner.nextLine());
        String [] firstArray= new String[row];
        String [] secondArray=new String[row];

        for (int i =1; i <=row ; i++) {
            String [] numbers = scanner.nextLine().split(" ");
            String firstNum = numbers[0];
            String secondNum = numbers[1];
            if (i%2==0){
                secondArray[i-1]=firstNum;
                firstArray[i-1]=secondNum;
            } else {
                firstArray[i-1]=firstNum;
                secondArray[i-1]=secondNum;
            }
        }
        System.out.println(String.join(" ",firstArray));
        System.out.println(String.join(" ",secondArray));
    }
}
