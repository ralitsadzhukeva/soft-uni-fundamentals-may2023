package TextProcessingExercises_14;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        String[] path = input.split("\\\\");
        String file = path[path.length-1];

        String fileName = file.split("\\.")[0];
        String extension = file.split("\\.")[1];

        System.out.printf("File name: %s%nFile extension: %s",fileName,extension);
    }
}
