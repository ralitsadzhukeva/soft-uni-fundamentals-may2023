package ObjectClassesExercises_10.VehicleCatalogue_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Catalogue> catalogueList = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] token = input.split("\\s+");
            catalogueList.add(new Catalogue(token[0],token[1],token[2],Integer.parseInt(token[3])));
            input=scanner.nextLine();
        }
        String model =scanner.nextLine();
        double sumCar=0;
        double sumTruck=0;
        int cars=0;
        int trucks=0;
        while (!model.equals("Close the Catalogue")){
            for (Catalogue catalogue:catalogueList ) {
                if (catalogue.getModel().equals(model)) {
                    System.out.println(catalogue);
                }
            }
            model=scanner.nextLine();
        }
        for (Catalogue catalogue:catalogueList) {
            if (catalogue.getType().equals("car")){
                cars++;
                sumCar+=catalogue.getHorsePower();
            }
            else if (catalogue.getType().equals("truck")){
                trucks++;
                sumTruck+=catalogue.getHorsePower();
            }
        }
        double averageCars = sumCar/cars;
        if (cars==0){averageCars=0;}
        System.out.printf("Cars have average horsepower of: %.2f.%n",averageCars);
        double averageTrucks = sumTruck/trucks;
        if (trucks==0){averageTrucks=0;}
        System.out.printf("Trucks have average horsepower of: %.2f.%n",averageTrucks);
    }
}
