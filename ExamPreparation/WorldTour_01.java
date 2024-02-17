package ExamPreparation;

import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        StringBuilder trip = new StringBuilder(stops);

        int startIndex = 0;
        int endIndex = 0;
        String input = scanner.nextLine();
        while (!input.equals("Travel")) {
            String[] inputParts = input.split(":");
            String command = inputParts[0];
            switch (command) {
                case "Add Stop":
                    startIndex = Integer.parseInt(inputParts[1]);
                    String destination = inputParts[2];
                    if (startIndex >= 0 && startIndex <= trip.length()) {
                        trip.insert(startIndex, destination);
                    }
                    break;
                case "Remove Stop":
                    startIndex = Integer.parseInt(inputParts[1]);
                    endIndex = Integer.parseInt(inputParts[2]);
                    if (startIndex >= 0 && startIndex < endIndex && endIndex <= trip.length()) {
                        trip.delete(startIndex, endIndex+1);
                    }
                    break;
                case "Switch":
                    String oldDestination = inputParts[1];
                    String newDestination = inputParts[2];
                    String current = trip.toString();

                    if (stops.contains(oldDestination)) {
                        current = current.replace(oldDestination, newDestination);
                        trip = new StringBuilder(current);
                    }
                    break;

            }System.out.println(trip);
            input=scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s",trip.toString());

    }
}