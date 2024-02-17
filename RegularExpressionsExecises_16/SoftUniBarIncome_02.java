package RegularExpressionsExecises_16;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "%(?<name>[A-Za-z]+)%[^\\|$%\\.]*<(?<product>\\w+)>[^\\|$%\\.]*\\|(?<count>[0-9])\\|[^\\|\\$%\\.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);
        double finalSum = 0;

        while (!text.equals("end of shift")){
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()){
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double sum=0;
                sum=count*price;
                System.out.printf("%s: %s - %.2f%n",name,product,sum);
                finalSum+=sum;
            }
            text=scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",finalSum);
    }
}
