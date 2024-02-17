package RegularExpressionsExecises_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> text = Arrays.stream(scanner.nextLine().split("\\s*,\\s*"))
                .collect(Collectors.toList());

        String healthRegex = "[^0-9+*-\\/.]";
        Pattern healthPattern = Pattern.compile(healthRegex);

        String damageRegex = "\\+?\\-?\\d+\\.?\\d*";
        Pattern damagePattern = Pattern.compile(damageRegex);

        for (String name:text) {
            Matcher matcherHealth = healthPattern.matcher(name);
            int health = 0;
            while (matcherHealth.find()){
                char symbol = matcherHealth.group().charAt(0);
                health+=symbol;
            }
            Matcher matcherDamage = damagePattern.matcher(name);
            double damage=0;
            while (matcherDamage.find()){
                double current = Double.parseDouble(matcherDamage.group());
                damage+=current;
            }
            for (char symbol:name.toCharArray()) {
                if (symbol=='/'){
                    damage/=2;
                } else if (symbol=='*') {
                    damage*=2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n",name,health,damage);

        }
    }
}
