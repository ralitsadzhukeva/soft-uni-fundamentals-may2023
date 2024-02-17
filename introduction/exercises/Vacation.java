package introduction.exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String weekday = scanner.nextLine();
        double price = 0;
        double sum = 0;
        switch (type) {
            case "Students":
                switch (weekday) {
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.8;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }
                if (group >= 30) {
                    sum = price * group * 0.85;
                } else {
                    sum = price * group;
                }
                break;
            case "Business":
                switch (weekday) {
                    case "Friday":
                        price = 10.9;
                        break;
                    case "Saturday":
                        price = 15.6;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }
                if (group >= 100) {
                    sum = price * (group - 10);
                } else {
                    sum = price * group;
                    break;
                }
                break;
            case "Regular":
                switch (weekday) {
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.5;
                        break;
                }
                if (group >=10 && group <= 20) {
                    sum = price *group* 0.95;
                } else {
                    sum = price * group;
                    break;

                }
                break;
        }
        System.out.printf("Total price: %.2f",sum);
    }
}
