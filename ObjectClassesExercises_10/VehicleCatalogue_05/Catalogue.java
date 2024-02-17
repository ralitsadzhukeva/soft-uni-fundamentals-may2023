package ObjectClassesExercises_10.VehicleCatalogue_05;

public class Catalogue {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public void setType(String type) {
        this.type = type;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public String getType() {
        return type;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getHorsePower() {
        return horsePower;
    }
    public Catalogue(String type,String model,String color, int horsePower){
        this.type=type;
        this.model=model;
        this.color=color;
        this.horsePower=horsePower;
    }
    @Override
    public String toString(){
        String typeVehicle = type.equals("car")?"Car":"Truck";
        return "Type: " + typeVehicle + "\n"+
                "Model: " + model + "\n"+
                "Color: " + color + "\n" +
                "Horsepower: " + horsePower;
    }
}
