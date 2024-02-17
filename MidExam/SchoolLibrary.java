package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> vehicles = Arrays.stream(scanner.nextLine().split(">>"))
                .collect(Collectors.toList());

        double totalTaxCollected = 0.0;

        for (int i = 0; i < vehicles.size(); i++) {
            String vehicle = vehicles.get(i);
            String[] vehicleInfo = vehicle.split("\\s+");
            String type = vehicleInfo[0];
            int taxYears = Integer.parseInt(vehicleInfo[1]);
            int kilometers = Integer.parseInt(vehicleInfo[2]);

            double initialTax = 0.0;
            double tax = 0.0;

            switch (type) {
                case "family":
                    initialTax = 50.0;
                    if (kilometers / 3000 == 2) {
                        tax = initialTax + 12 * (kilometers / 3000) - 5 * taxYears;
                    } else {
                        tax = initialTax - 5 * taxYears;
                    }
                    break;
                case "heavyDuty":
                    initialTax = 80.0;
                    tax = initialTax - 8 * taxYears + 14 * (kilometers / 9000);
                    break;
                case "sports":
                    initialTax = 100.0;
                    tax = initialTax - 9 * taxYears + 18 * (kilometers / 2000);
                    break;
                default:
                    System.out.println("Invalid car type.");
                    continue;
            }

            if (tax >= 0) {
                totalTaxCollected += tax;
                System.out.printf("A %s car will pay %.2f euros in taxes.%n", type, tax);
            }
        }

        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.%n", totalTaxCollected);
    }
}