package introdction_01;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());
        while (i%2!=0){
            System.out.printf("Please write an even number.%n");
            i = Integer.parseInt(scanner.nextLine());
            if (i%2==0){
                break;
            }
        }
        System.out.printf("The number is: %d%n",Math.abs(i));
    }
}
