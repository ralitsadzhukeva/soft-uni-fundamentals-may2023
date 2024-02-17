package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class ThePianist_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> composerMap = new LinkedHashMap<>();
        LinkedHashMap<String, String> keyMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] pieces = scanner.nextLine().split("\\|");
            String piece = pieces[0];
            String composer = pieces[1];
            String key = pieces[2];

            composerMap.put(piece, composer);
            keyMap.put(piece, key);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] commandParts = command.split("\\|");
            String action = commandParts[0];
            String piece = commandParts[1];
            switch (action) {
                case "Add":
                    String composer = commandParts[2];
                    String key = commandParts[3];

                    if (!composerMap.containsKey(piece) || !keyMap.containsKey(piece)) {
                        composerMap.put(piece, composer);
                        keyMap.put(piece, key);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    } else {
                        System.out.printf("%s is already in the collection!%n", piece);
                    }
                    break;
                case "Remove":
                    if (composerMap.containsKey(piece) || keyMap.containsKey(piece)) {
                        composerMap.remove(piece);
                        keyMap.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                case "ChangeKey":
                    String newKey = commandParts[2];
                    if (composerMap.containsKey(piece) || keyMap.containsKey(piece)) {
                        keyMap.replace(piece, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        composerMap.forEach((piece, composer) -> {
            String key = keyMap.get(piece);
            System.out.printf("%s -> Composer: %s, Key: %s%n", piece, composer, key);
        });
    }
}
