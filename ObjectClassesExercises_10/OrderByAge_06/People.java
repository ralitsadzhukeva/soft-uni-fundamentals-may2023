package ObjectClassesExercises_10.OrderByAge_06;

public class People {
    private String name;
    private int id;
    private int age;

    public People(String name, int id, int age) {
        this.name=name;
        this.id=id;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}
