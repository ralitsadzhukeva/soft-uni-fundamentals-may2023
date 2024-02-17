package MidExam;

import java.util.Scanner;

public class BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double total = 0;

        for (int i = 1; i <= n; i++) {
            String city = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());
            double profit = 0;
            if (i % 3 == 0) {
                expenses *= 1.5;
            } else if (i%5==0) {
                income*=0.9;
            }
            profit=income-expenses;
            total+=profit;
            System.out.printf("In %s Burger Bus earned %.2f leva.%n",city,profit);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.",total);
    }
}