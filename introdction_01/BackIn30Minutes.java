package introdction_01;
import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        minutes+=30;
        if (minutes>59){
            hours++;
            minutes-=60;
        }
        if (hours+1>23) {
            hours-=24;
        }
        if (minutes<10) {
            System.out.printf("%d:0%d", hours, minutes);
        }
        else {
            System.out.printf("%d:%d", hours,Math.abs(minutes));
        }
    }
}
