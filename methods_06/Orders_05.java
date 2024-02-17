package methods_06;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        Orders(product, quantity);
    }
    public static void Orders (String product,int quantity){
        double price=0;
        switch (product){
            case "coffee":
                price=quantity*1.50;
                break;
            case "water":
                price=quantity*1.00;
                break;
            case "coke":
                price=quantity* 1.40;
                break;
            case "snacks":
                price=quantity* 2.00;
                break;
                default:
                break;
        }
        System.out.printf("%.2f",price);
    }
}
