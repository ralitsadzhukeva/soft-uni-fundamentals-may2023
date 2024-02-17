package ExamPreparation;

import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();

        int index1 = 0;
        int index2 = 0;
        String input = scanner.nextLine();

        while (!input.contains("Generate")){
            String command = input.split(">>>")[0];
            switch (command){
                case "Contains":
                    String substring = input.split(">>>")[1];
                    if (key.contains(substring)) {
                        System.out.printf("%s contains %s%n", key, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String cases = input.split(">>>")[1];
                    index1 = Integer.parseInt(input.split(">>>")[2]);
                    index2 = Integer.parseInt(input.split(">>>")[3]);
                    substring = key.substring(index1, index2);

                    if (cases.equals("Upper")) {
                        key = key.replace(substring, substring.toUpperCase());
                    } else if (cases.equals("Lower")) {
                        key = key.replace(substring, substring.toLowerCase());
                    }
                    System.out.println(key);
                    break;
                case "Slice":
                    index1 = Integer.parseInt(input.split(">>>")[1]);
                    index2 = Integer.parseInt(input.split(">>>")[2]);
                    substring = key.substring(index1, index2);
                    key = key.replace(substring, "");
                    System.out.println(key);

                    break;

            }
            input=scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s",key);
    }
}
