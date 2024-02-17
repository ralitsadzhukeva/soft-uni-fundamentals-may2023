package MidExamPreparation_01;

import java.util.Scanner;

public class BonusScoringSystem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());
        double maxBonus =0;
        int biggestAttendance=0;
        for (int i = 0; i < students; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());
            double totalBonus = attendance * 1.0 / lectures * (5 + bonus);
            if (maxBonus<totalBonus){
                maxBonus=totalBonus;
                biggestAttendance=attendance;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n",Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.",biggestAttendance);
    }
}
