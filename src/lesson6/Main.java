package lesson6;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat("Timofey", "black", 8);
        Dog dog = new Dog("Patron", "white", 3);


        System.out.println(cat.toString());
        System.out.println(dog.toString());

        cat.setObstacleLenght(90);
        dog.setObstacleLenghtRun(255);
        dog.setObstacleLenghtSwim(9);

        cat.run();
        dog.run();

        dog.swim();


    }
}


