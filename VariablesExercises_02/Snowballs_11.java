package VariablesExercises_02;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int snowballs = Integer.parseInt(scanner.nextLine());
        double value = 0;
        int maxSnowballSnow=0;
        int maxSnowballTime=0;
        int maxSnowballQuality=0;
        for (int i = 0; i < snowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            int snowballValue= snowballSnow / snowballTime;
            double SV = Math.pow(snowballValue,snowballQuality);
            if (SV>value){
                value=SV;
                maxSnowballQuality=snowballQuality;
                maxSnowballSnow=snowballSnow;
                maxSnowballTime=snowballTime;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnowballSnow,maxSnowballTime,value,maxSnowballQuality);
    }
}
