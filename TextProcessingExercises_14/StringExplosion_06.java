package TextProcessingExercises_14;

import java.util.Scanner;

public class StringExplosion_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);

        int total=0;
        for (int i = 0; i <=text.length()-1 ; i++) {
            char current = text.charAt(i);
            if (current=='>'){
                int strength = Integer.parseInt(text.charAt(i+1)+"");
                total+=strength;
            } else if (current!='>'&& total>0){
                text.deleteCharAt(i);
                total--;
                i--;
            }
        }
        System.out.println(text);
    }
}
