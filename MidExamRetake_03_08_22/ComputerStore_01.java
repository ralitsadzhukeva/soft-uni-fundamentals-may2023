package MidExamRetake_03_08_22;

import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();
        double sum=0;
        double taxes=0;
        double total = 0;
        while (!input.equals("special")&&!input.equals("regular")){
            double prices = Double.parseDouble(input);
            if (prices<0){
                System.out.println("Invalid price!");
            } else {
                sum += prices;
                taxes += prices * 0.2;
                total = taxes + sum;
            }

            input=scanner.nextLine();
        }
        if (total==0) {
            System.out.println("Invalid order!");
        } else if (input.equals("special")){
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",sum);
            System.out.printf("Taxes: %.2f$%n",taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$",total*0.9);
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",sum);
            System.out.printf("Taxes: %.2f$%n",taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$",total);
        }
    }
}
