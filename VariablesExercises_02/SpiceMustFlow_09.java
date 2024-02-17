package VariablesExercises_02;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int spicesStart = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int total = 0;
        while (spicesStart>=100){
            int spices = spicesStart-26;
            days++;
            total+=spices;
            spicesStart-=10;
        }
        System.out.println(days);
        if (total>=26){
            total-=26;
        }
        System.out.println(total);
    }
}
