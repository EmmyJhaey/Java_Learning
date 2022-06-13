public class Zoo {
    public static void main(String[] args) {
        //Bird Instance
        Animal Falcon1 = new Falcon("Dora", "Grey", 12, 3);
        Falcon1.speak();

        //Breaker
        System.out.println("----------------------------------------------------");

        //Primate Instance
        Animal Ape = new Primate("Thomas", "black", 30, 12);
        Ape.speak();

        System.out.println("TESTING METHOD AFTER THIS POINT =========================");

        moveAnimal(Ape);
    }

    public static void moveAnimal(Animal animal){
        animal.move();
    }
}
