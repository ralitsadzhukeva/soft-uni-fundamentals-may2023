package introduction.exercises;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightSaber = Double.parseDouble(scanner.nextLine());
        double robe= Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());
        double totalPrice = 0;
        int belts = students/6;
        double reserve = Math.ceil((students*0.1)+students);
        totalPrice = (reserve*lightSaber)+((students-belts)*beltsPrice)+(students*robe);
        if (total>=totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
        }
        else {
            System.out.printf("George Lucas will need %.2flv more.",totalPrice-total);
        }
    }
}
