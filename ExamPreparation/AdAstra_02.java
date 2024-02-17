package ExamPreparation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(?<separator>[#\\|])(?<itemName>[A-Za-z\\s+]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d{1,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> foodList = new ArrayList<>();
        int totalCalories=0;
        while (matcher.find()){
            String food = matcher.group("itemName");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            totalCalories+=calories;
            foodList.add(String.format("Item: %s, Best before: %s, Nutrition: %d",food,date,calories));
        }
        double days = 1.0*totalCalories/2000;

        if (days>0){
            System.out.printf("You have food to last you for: %.0f days!%n",Math.floor(days));
            foodList.forEach(System.out::println);
        }
        else {
            System.out.println("You have food to last you for: 0 days!");
        }

    }
}
