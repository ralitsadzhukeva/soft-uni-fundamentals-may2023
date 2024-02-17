package ListsExercises_10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> lessons = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("course start")){
            String [] commandParts=command.split(":");
            String commandName= commandParts[0];
            String topic = commandParts[1];
            switch (commandName){
                case "Add":
                    if (lessons.contains(topic)){
                        break;
                    } else {
                        lessons.add(topic);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[2]);
                    if (lessons.contains(topic)){
                        break;
                    } else {
                        lessons.add(index,topic);
                    }
                    break;
                case "Remove":
                    if (lessons.contains(topic)){
                        lessons.remove(topic);
                    }
                    break;
                case "Swap":
                    break;
            }
        }
        for (int i = 0; i <lessons.size() ; i++) {
            System.out.printf("%d.%s%n",i+1,lessons.get(i));
        }
    }
}
