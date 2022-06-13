public class Animal {
    String name;
    int  age;
    String color;
    String gender;

    public Animal(String name, int age, String color, String gender) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.gender = gender;
    }


    public void speak(){
        System.out.println("I am a " + name  +  " and around the age of " + age + ", am  " + color + " in color and happens to also be a " + gender);
    }

    public void eat(){
        System.out.println(name + " is eating.... ");
    }

    public void sleeping(){
        System.out.println(name + " is tired and having a rest : sleeping !...... ");
    }
}
