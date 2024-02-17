package VariablesExercises_02;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int poke = 0;
        int remaining =n;
        while (n>=m){
           n-=m;
            poke++;
            if (n==0.5*remaining){
                if (y>0) {
                    n /= y;
                }
            }
        }
        System.out.println(n);
        System.out.println(poke);
    }
}
