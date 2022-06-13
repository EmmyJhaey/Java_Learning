public class Primate extends Animal {
    public Primate(String name, String color,  int age, int weight){
        super(name, color, weight, age);
    }

    public  void act(){
        System.out.println(this.name + " is a primate Animal and it is acting like a Human");
    }

    @Override
    public void move() {
        System.out.println("Moving with either 4 or 2 feet's....");
    }
}
