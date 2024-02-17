package ListsExercises_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> partyGoers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String people = scanner.nextLine();
            String[] names = people.split(" ");
            String name = names[0];
            if (!"not".equals(names[2])) {
                if (partyGoers.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    partyGoers.add(name);
                }
            } else {
                    if (!partyGoers.contains(name)) {
                        System.out.printf("%s is not in the list!%n", name);
                    } else {
                        partyGoers.remove(names[0]);
                    }

            }
        }
        for (String name:partyGoers) {
            System.out.println(name);
        }
    }
}