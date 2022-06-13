 public class Bird extends Animal {

    public Bird(String name, String color, int age, int weight) {
        super(name, color, age, weight);
    }

    public void flap(){
        System.out.println(this.name + " is a type of Bird and it is Flying ");
    }

}

