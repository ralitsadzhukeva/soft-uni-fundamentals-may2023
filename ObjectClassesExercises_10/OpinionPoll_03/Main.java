package ObjectClassesExercises_10.OpinionPoll_03;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List <Person> personList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String people = scanner.nextLine();
            String name = people.split(" ")[0];
            int age = Integer.parseInt(people.split(" ")[1]);

            if (age>30){
                Person person = new Person(name,age);
                personList.add(person);
            }
        }
        for (Person person:personList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
