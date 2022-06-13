import interfaces.Flyable;

public class Chicken extends Bird implements Flyable {

    public Chicken(String name, String color, int age, int weight) {
        super(name, color, age, weight);
    }

    @Override
    public void fly() {
        System.out.println("Flying so high...... ");
    }
}
