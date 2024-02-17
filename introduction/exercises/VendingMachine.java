package introduction.exercises;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        double sum = 0;
        String textInput = "";
        while (true){
            textInput=scanner.nextLine();
            if (textInput.equals("Start")){
                break;
            }
            double coin = Double.parseDouble(textInput);
            if (coin==0.1 || coin==0.2 || coin==0.5 || coin==1 || coin==2){
                sum+=coin;
            }else {
                System.out.printf("Cannot accept %.2f%n",coin);
            }
        }
        double price=0;
        String input;
        boolean flag = false;
        while (true){
            input = scanner.nextLine();
            switch (input) {
                case ("Nuts"):
                    price = 2;
                    flag = true;
                    break;
                case ("Water"):
                    price=0.7;
                    flag=true;
                    break;
                case ("Crisps"):
                    price=1.5;
                    flag=true;
                    break;
                case ("Soda"):
                    price=0.8;
                    flag=true;
                    break;
                case ("Coke"):
                    price=1;
                    flag=true;
                    break;
            }
            if (input.equals("End")){
                break;
            }
            if (sum<price){
                System.out.printf("Sorry, not enough money%n");
            } else if (flag){
                System.out.printf("Purchased %s%n",input);
                sum-=price;
            }else {
                System.out.printf("Invalid product%n");
            }

        }
        System.out.printf("Change: %.2f",sum);
    }
}