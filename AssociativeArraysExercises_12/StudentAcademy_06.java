package AssociativeArraysExercises_12;

import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<Double>> people =new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (people.containsKey(name)){
                List<Double> currentGrade = people.get(name);
                currentGrade.add(grade);
            }
            else {
                people.put(name, new ArrayList<>());
                people.get(name).add(grade);
            }
        }
        LinkedHashMap<String,Double> averageGrade=new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry: people.entrySet()) {
            String name = entry.getKey();;
            List<Double> grades = entry.getValue();
            double average = getAverage(grades);

            if (average>=4.5){
            averageGrade.put(name,average);
            }
        }
        averageGrade.entrySet().forEach(entry ->System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));
    }
    public static double getAverage(List<Double>grades){
        double sum = 0;
        for (double grade:grades) {
            sum+=grade;
        }
        return sum/ grades.size();
    }
}
