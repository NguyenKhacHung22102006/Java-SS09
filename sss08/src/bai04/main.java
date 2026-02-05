package bai04;

public class main {
    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.guardHouse();
        }
    }
}
