package ArraysMore_05;

import java.util.Scanner;

public class RecursiveFibonacci_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fibonacciSequencePosition= Integer.parseInt(scanner.nextLine());
        int[] fibonacciSequence=new int[50];

        fibonacciSequence[0]=1;
        fibonacciSequence[1]=1;

        if (fibonacciSequencePosition>2){
            for (int i = 2; i <=fibonacciSequencePosition ; i++) {
                fibonacciSequence[i]=fibonacciSequence[i-1] + fibonacciSequence [i-2];
            }
        }
        System.out.println(fibonacciSequence[fibonacciSequencePosition-1]);
    }
}
