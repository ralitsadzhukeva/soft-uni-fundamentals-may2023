package AssociativeArraysExercises_12;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String,Double> productPrice= new LinkedHashMap<>();
        LinkedHashMap<String,Integer> productQuantity = new LinkedHashMap<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("buy")){
                break;
            }
            String product = input.split("\\s+")[0];
            double price = Double.parseDouble(input.split("\\s+")[1]);
            int quantity = Integer.parseInt(input.split("\\s+")[2]);

            if (!productQuantity.containsKey(product)) {
                productQuantity.put(product,quantity);
            }else {
                int current = productQuantity.get(product);
                productQuantity.put(product,current+quantity);
            }
            productPrice.put(product,price);
        }
        for (Map.Entry<String, Double> entry: productPrice.entrySet()) {
            String product = entry.getKey();
            double sum = productQuantity.get(product)*productPrice.get(product);
            System.out.printf("%s -> %.2f%n",product,sum);
        }
    }
}