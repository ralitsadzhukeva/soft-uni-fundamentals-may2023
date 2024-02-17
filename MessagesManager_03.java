package FinalExam;

import java.util.*;

public class MessagesManager_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int messageCapacity = Integer.parseInt(scanner.nextLine());
        String input;
        LinkedHashMap<String, List<Integer>> messagesList = new LinkedHashMap<>();

        while (!(input = scanner.nextLine()).equals("Statistics")) {
            String[] commandParts = input.split("=");
            String command = commandParts[0];

            switch (command) {
                case "Add":
                    String username = commandParts[1];
                    int sent = Integer.parseInt(commandParts[2]);
                    int received = Integer.parseInt(commandParts[3]);

                    if (!messagesList.containsKey(username)) {
                        List<Integer> messageCount = new ArrayList<>();
                        messageCount.add(sent);
                        messageCount.add(received);
                        messagesList.put(username, messageCount);
                    }
                    break;

                case "Message":
                    String sender = commandParts[1];
                    String receiver = commandParts[2];
                    if (messagesList.containsKey(sender) && messagesList.containsKey(receiver)) {
                        messagesList.get(sender).set(0, messagesList.get(sender).get(0) + 1);
                        messagesList.get(receiver).set(1, messagesList.get(receiver).get(1) + 1);

                        if (messagesList.get(sender).get(0) + messagesList.get(sender).get(1) >= messageCapacity) {
                            messagesList.remove(sender);
                            System.out.printf("%s reached the capacity!%n", sender);
                        }

                        if (messagesList.get(receiver).get(0) + messagesList.get(receiver).get(1) >= messageCapacity) {
                            messagesList.remove(receiver);
                            System.out.printf("%s reached the capacity!%n", receiver);
                        }
                    }
                    break;
                case "Empty":
                    String usernameToRemove = commandParts[1];

                    if (usernameToRemove.equals("All")) {
                        messagesList.clear();
                        continue;
                    }

                    if (messagesList.containsKey(usernameToRemove)) {
                        messagesList.remove(usernameToRemove);
                    }
                    break;
            }
        }
        System.out.printf("Users count: %d%n",messagesList.size());

        messagesList.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue().stream().mapToInt(Integer::intValue).sum()));
    }
}
