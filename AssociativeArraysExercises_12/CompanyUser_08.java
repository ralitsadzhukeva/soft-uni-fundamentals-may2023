package AssociativeArraysExercises_12;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class CompanyUser_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, List<String>>company = new LinkedHashMap<>();


        while (!input.equals("End")){
            String[] inputParts = input.split(" -> ");
            String companyName = inputParts[0];
            String id = inputParts[1];

            List<String> currentEmployees = company.get(companyName);
            boolean containsId = currentEmployees != null && currentEmployees.contains(id);

            if (!containsId){
                company.putIfAbsent(companyName,new ArrayList<>());
                company.get(companyName).add(id);
            }

            input=scanner.nextLine();
        }
        company.entrySet().stream()
                .forEach(c ->{
                    System.out.printf("%s%n",c.getKey());
                    c.getValue().forEach(e -> System.out.printf("-- %s%n",e));
                });
    }
}