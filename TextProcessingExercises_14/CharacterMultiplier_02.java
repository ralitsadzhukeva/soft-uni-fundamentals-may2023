package TextProcessingExercises_14;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(" ");

        String first = names[0];
        String second = names[1];

        int min = Math.min(first.length(),second.length());
        int max = Math.max(first.length(),second.length());

        int sum=0;
        for (int i = 0; i < min; i++) {
            sum+=(first.charAt(i)*second.charAt(i));
        }
        if (max==min){
            System.out.println(sum);
            return;
        }
        sum=getLeftSymbols(first,second,min,max,sum);

        System.out.println(sum);
    }
    private static int getLeftSymbols(String first, String second, int min,int max,int sum){

        if (max==first.length()){
            for (int i = min; i <first.length() ; i++) {
                sum+=first.charAt(i);
            }
        } else {
            for (int i = min; i <second.length() ; i++) {
                sum+=second.charAt(i);
            }
        }
        return sum;
    }
}
