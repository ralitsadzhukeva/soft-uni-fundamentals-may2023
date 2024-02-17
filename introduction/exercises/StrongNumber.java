package introduction.exercises;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sumFact=0;
        int startNum=num;
        while (num>0){
            int lastDigit = num%10;
            int fact=1;
            for (int i = 1; i <=lastDigit ; i++) {
                fact=fact*i;
            }
            sumFact+=fact;
            num=num/10;
        }
        if (sumFact==startNum){
            System.out.printf("yes");
        }
        else {
            System.out.printf("no");
        }
    }
}

