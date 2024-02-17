package ObjectClassesExercises_10.OrderByAge_06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<People> peopleList = new ArrayList<>();

        while (true){
            String input = scanner.nextLine();
            if (input.equals("End")){
                break;
            }
            String name = input.split(" ")[0];
            int id = Integer.parseInt(input.split(" ")[1]);
            int age = Integer.parseInt(input.split(" ")[2]);
            People people = new People(name,id,age);
            peopleList.add(people);
        }
        Collections.sort(peopleList, Comparator.comparing(People::getAge));
        for (People people: peopleList) {
            System.out.printf("%s with ID: %d is %d years old.%n",people.getName(),people.getId(),people.getAge());
        }
    }
}
