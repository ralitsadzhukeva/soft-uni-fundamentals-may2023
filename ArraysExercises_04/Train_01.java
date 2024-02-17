package ArraysExercises_04;

import java.util.Arrays;
import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int[] people = new int[wagons];
        int sum=0;
        for (int i = 0; i < wagons; i++) {
            people[i]=Integer.parseInt(scanner.nextLine());
            System.out.print(people[i]+" ");
            sum+=people[i];
        }
        System.out.printf("%n%d",sum);
    }
}
