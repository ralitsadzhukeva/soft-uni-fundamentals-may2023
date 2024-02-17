package introduction.exercises;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double total = 0;
        for (int i = 1; i <=n ; i++) {
            double capsulePrice = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());
            price=(days*capsuleCount)*capsulePrice;
            total+=price;
            System.out.printf("The price for the coffee is: $%.2f%n",price);
        }
        System.out.printf("Total: $%.2f",total);
    }
}
