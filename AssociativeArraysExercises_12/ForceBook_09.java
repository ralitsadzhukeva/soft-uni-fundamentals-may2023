package AssociativeArraysExercises_12;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input =scanner.nextLine();
        LinkedHashMap<String, List<String>> teams = new LinkedHashMap<>();


        while(!input.equals("Lumpawaroo")){
            if (input.contains(" | ")){
                String side = input.split("\\|")[0];
                String user = input.split("\\|")[1];
                if (!teams.containsKey(side)){
                    teams.put(side,new ArrayList<>());

                }
                boolean isExisting = false;
                for (List<String> list: teams.values()) {
                    if (list.contains(user)){
                        isExisting=true;
                        break;
                    }
                }
                if (!isExisting){
                    teams.get(side).add(user);
                }
            } else if (input.contains(" -> ")) {
                String side = input.split(" -> ")[0];
                String user = input.split(" -> ")[1];

                teams.entrySet().forEach(entryTeam -> entryTeam.getValue().remove(user));

                if (!teams.containsKey(side)){
                    teams.put(side,new ArrayList<>());
                    teams.get(side).add(user);
                }
                else {
                    teams.get(user).add(user);
                }
                System.out.printf("%s joins the %s side!%n",user,side);
            }
            input=scanner.nextLine();
        }
        teams.entrySet().stream().filter(teamEntry -> teamEntry.getValue().size()>0)
                .forEach(entry ->{
                    System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! "+ player));
                });
    }
}
