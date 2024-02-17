package ArraysExercises_04;

import java.util.Scanner;

public class TreasureHunt_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] loot = scanner.nextLine().split("\\|");
        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] parts = command.split(" ");
            switch (parts[0]) {
                case "Loot":
                    for (int i = 1; i < parts.length; i++) {
                        boolean contained = false;
                        for (int j = 0; j < loot.length; j++) {
                            if (parts[i].equals(loot[j])) {
                                contained = true;
                                break;
                            }
                        }
                        if (!contained) {
                            String newChest = parts[i] + " " + String.join(" ", loot);
                            loot = newChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int position = Integer.parseInt(parts[1]);
                    if (position <= loot.length - 1 && position >= 0) {
                        String itemDropped = loot[position];
                        for (int i = position; i < loot.length - 1; i++) {
                            loot[i] = loot[i + 1];
                        }
                        loot[loot.length - 1] = itemDropped;
                    } else {
                        break;
                    }
                    break;
                case "Steal":
                    int stolen = Integer.parseInt(parts[1]);
                    if (stolen >= 0 && stolen < loot.length) {
                        for (int i = 0; i < stolen; i++) {
                            System.out.print(loot[loot.length - stolen + i]);
                            if (i != stolen - 1) {
                                System.out.print(", ");
                            }
                        }
                        String[] newChest = new String[loot.length - stolen];
                        for (int i = 0; i < newChest.length; i++) {
                            newChest[i] = loot[i];
                        }
                        loot = newChest;
                    } else if (stolen >= 0) {
                        for (int i = 0; i < loot.length; i++) {
                            System.out.print(loot[i]);
                            if (i != loot.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        loot = new String[0];
                    }
                    System.out.println();
                    break;
            }
            command=scanner.nextLine();
        }
        String count = String.join("",loot);
        int counter = 0;
        for (int i = 0; i < count.length(); i++) {
            counter++;
        }
        double average = (1.0*counter)/ loot.length;
        if (counter>0){
            System.out.printf("Average treasure gain: %.2f pirate credits.",average);
        } else {
            System.out.printf("Failed treasure hunt.");
        }
    }
}