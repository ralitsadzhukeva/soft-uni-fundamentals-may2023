package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([=\\/])(?<destination>[A-Z][a-zA-Z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List <String> destinations = new ArrayList<>();
        int points=0;
        while (matcher.find()){
            destinations.add(matcher.group("destination"));
        }
        System.out.println("Destinations: "+String.join(", ",destinations));

        for (String destination:destinations) {
            points+= destination.length();
        }
        System.out.printf("Travel Points: %d",points);
    }
}
