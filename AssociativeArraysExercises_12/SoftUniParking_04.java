package AssociativeArraysExercises_12;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number= Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String,String> registered=new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            String command = input.split(" ")[0];
            String name = input.split(" ")[1];

            switch (command){
                case "register":
                    String license = input.split(" ")[2];
                    if (registered.containsKey(name)){
                        System.out.printf("ERROR: already registered with plate number %s%n",license);
                    }
                    else {
                        registered.put(name,license);
                        System.out.printf("%s registered %s successfully%n",name,license);
                    }
                    break;
                case "unregister":
                    if (registered.containsKey(name)){
                        registered.remove(name);
                        System.out.printf("%s unregistered successfully%n",name);
                    }
                    else {
                        System.out.printf("ERROR: user %s not found%n",name);
                    }
                    break;
            }
        }
        for (Map.Entry<String,String> entry: registered.entrySet()) {
            System.out.printf("%s => %s%n",entry.getKey(),entry.getValue());
        }
    }
}
