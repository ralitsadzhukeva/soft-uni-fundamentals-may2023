package ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            String regex = "@#+(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(barcode);

            if (matcher.find()){
                String barcodeText = matcher.group("barcode");
                StringBuilder category = new StringBuilder();

                for (char symbol: barcodeText.toCharArray()) {
                    if (Character.isDigit(symbol)){
                        category.append(symbol);
                    }
                }
                if (category.length()==0){
                    System.out.println("Product group: 00");
                }
                else {
                    System.out.printf("Product group: %s%n",category.toString());
                }
            }
            else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
