package AssociativeArraysExercises_12;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();
        LinkedHashMap<String, List<String>> courses = new LinkedHashMap<>();

        while (!input.equals("end")){

            String course = input.split(" : ")[0];
            String name = input.split(" : ")[1];
            if (!courses.containsKey(course)){
                courses.put(course, new ArrayList<>());
            }
            courses.get(course).add(name);

            input=scanner.nextLine();
        }
        courses.entrySet()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().forEach(name -> System.out.println("-- " + name));
                });
    }
}