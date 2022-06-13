public class Animal {
    int age;
    int weight;
    String name;
    String color;

    public Animal(String name, String color, int age, int weight){
        super();
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Animal Behaviour

    public  void speak(){
        System.out.println("I am a   " + this.name);
        System.out.println("As you can see that i am " + this.color + " in color");
        System.out.println("I weigh " + this.weight + " pounds");
        System.out.println("I am " + this.age + " of age");
    }

    public  void  eating (){
        System.out.println(this.name + " is eating yummy !");
    }

    public void sleep(){
        System.out.println(this.name + " is Sleeping .... !!!");
    }

}
