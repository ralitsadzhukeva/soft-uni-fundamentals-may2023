package ObjectClassesExercises_10.Students_04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List <Students>studentsList  = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            String person = scanner.nextLine();
            String firstName = person.split(" ")[0];
            String lastName = person.split(" ")[1];
            double grade = Double.parseDouble(person.split(" ")[2]);

            Students students = new Students(firstName,lastName,grade);

            studentsList.add(students);
        }
        Collections.sort(studentsList, Comparator.comparing(Students::getGrade).reversed());
        for (Students students:studentsList) {
            System.out.printf("%s %s: %.2f%n",students.getFirstName(),students.getLastName(),students.getGrade());
        }
    }
}
