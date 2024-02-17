package ExamPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        HashMap<String, Integer> plantRarity = new HashMap<>();
        HashMap<String, Double> rate = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String plants = scanner.nextLine();
            String plant = plants.split("<->")[0];
            int rarity = Integer.parseInt(plants.split("<->")[1]);

            plantRarity.put(plant, rarity);
            rate.put(plant, 0.0);
        }
        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String command = input.split(": ")[0];
            String plants = input.split(": ")[1];
            String name = plants.split(" - ")[0];

            boolean isValid = command.equals("Rate") || command.equals("Update") || command.equals("Reset");

            if (!plantRarity.containsKey(name) ||!isValid) {
                System.out.println("error");
            } else {
                switch (command) {
                    case "Rate":
                        double rating =Double.parseDouble(plants.split(" - ")[1]);
                        if (rate.get(name)==0){
                            rate.put(name,rating);
                        }
                        else {
                            double newRate = (rate.get(name)+rating)/2;
                            rate.put(name,newRate);
                        }
                        break;
                    case "Update":
                        int rarity = Integer.parseInt(plants.split(" - ")[1]);
                        plantRarity.put(name,rarity);
                        break;
                    case "Reset":
                        rate.put(name,0.0);
                        break;
                }
                input = scanner.nextLine();
            }
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String,Integer> entry:plantRarity.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",entry.getKey(),entry.getValue(),rate.get(entry.getKey()));

        }
    }
}