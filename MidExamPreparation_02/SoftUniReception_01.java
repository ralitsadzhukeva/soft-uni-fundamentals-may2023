package MidExamPreparation_02;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());

        int totalHours = 0;

        while (students>0){
            int studentsPerHour = firstEmployee+secondEmployee+thirdEmployee;
            totalHours++;
            if (totalHours%4==0){
                continue;
            }
            students-=studentsPerHour;
        }
        System.out.printf("Time needed: %dh.",totalHours);
    }
}
