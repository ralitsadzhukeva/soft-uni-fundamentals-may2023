package ObjectsClasses_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_06 {
    public static class Student{
        String firstName;
        String lastName;
        String age;
        String town;
        public Student(String firstName, String lastName, String age,String town){
            this.firstName=firstName;
            this.lastName=lastName;
            this.age=age;
            this.town=town;
        }
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public String getAge() {
            return age;
        }
        public String getTown() {
            return town;
        }
        public void setAge(String age) {
            this.age = age;
        }

        public void setTown(String town) {
            this.town = town;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] studentsData = input.split(" ");
            String firstName = studentsData[0];
            String lastName = studentsData[1];
            String age = studentsData[2];
            String town = studentsData[3];

           if (isExisting(studentList,firstName,lastName)){
               int index =getExisting(studentList,firstName,lastName);
               studentList.get(index).setAge(age);
               studentList.get(index).setTown(town);
           } else {
               Student current = new Student(firstName,lastName,age,town);
               studentList.add(current);
           }
            input = scanner.nextLine();
        }
        String currentTown = scanner.nextLine();

        for (Student student : studentList) {
            if (student.getTown().equals(currentTown)) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    public static int getExisting (List<Student> studentList,String firstName, String lastName){
        int index=-1;
        for (int i = 0; i < studentList.size(); i++) {
            Student student =studentList.get(i);
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                index=i;
            }
        }
        return index;
    }
    static boolean isExisting (List<Student>studentList,String firstName, String lastName){
        for (Student student:studentList) {
            if (student.getFirstName().equals(firstName)&&student.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
}