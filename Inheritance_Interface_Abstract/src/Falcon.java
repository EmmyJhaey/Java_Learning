import interfaces.Flyable;

public class Falcon extends Bird implements Flyable {

    public Falcon(String name, String color, int age, int weight) {
        super(name, color, age, weight);
    }

//    @Override
//    public void move() {
//        System.out.println();
//    }

    @Override
    public void fly() {
        System.out.println("Falcon Flying so high.....");
    }
}
