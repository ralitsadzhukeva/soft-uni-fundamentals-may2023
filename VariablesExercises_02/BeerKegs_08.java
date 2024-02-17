package VariablesExercises_02;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double biggestKeg = 0;
        String name = "";
        for (int i = 0; i < n ; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * radius * radius * height;
            if (volume>biggestKeg){
                biggestKeg=volume;
                name=model;
            }
        }
        System.out.println(name);
    }
}
