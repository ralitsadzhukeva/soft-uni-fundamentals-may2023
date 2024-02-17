package introduction.exercises;
import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice=Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        //Every second lost game, Peter trashes his headset.
        //Every third lost game, Peter trashes his mouse.
        //When Peter trashes both his mouse and headset in the same lost game, he also trashes his keyboard.
        //Every second time, when he trashes his keyboard, he also trashes his display.
        double headset = (lostGames/2)*headsetPrice;
        double mouse = (lostGames/3)*mousePrice;
        double keyboard = (lostGames/6)*keyboardPrice;
        double display = (lostGames/12)*displayPrice;
        double expenses=headset+mouse+keyboard+display;
        System.out.printf("Rage expenses: %.2f lv.", expenses);

    }
}
