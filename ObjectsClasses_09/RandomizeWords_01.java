package ObjectsClasses_09;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] sentence = scanner.nextLine().split(" ");
        Random rndm = new Random();
        for (int i = 0; i < sentence.length; i++) {
            int j = rndm.nextInt(sentence.length);
            int k = rndm.nextInt(sentence.length);

            String old  = sentence[j];
            sentence[j]=sentence[k];
            sentence[k]=old;
        }
        System.out.println(String.join(System.lineSeparator(),sentence));
    }
}
