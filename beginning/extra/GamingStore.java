package beginning.extra;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());
        double total = balance;
        String game = "";
        double spent =0;
        double gamePrice = 0;
        while (!"Game time".equalsIgnoreCase(game = scanner.nextLine())){
            gamePrice=0;
            if (balance==0){
                System.out.println("Out of money!");
                break;
            }
            switch (game) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case "Honored 2":
                    gamePrice=59.99;
                    break;
                case "RoverWatch":
                    gamePrice=29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (balance>=gamePrice && gamePrice>0){
                spent+=gamePrice;
                balance-=gamePrice;
                System.out.printf("Bought %s%n",game);
            } else if (balance<gamePrice && gamePrice>0) {
                System.out.println("Too Expensive");
            }
        }
        if (balance>0){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, total-spent);
        }
    }
}
