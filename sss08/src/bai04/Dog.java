package bai04;

public class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Chó sủa: Gâu gâu");
    }

    public void guardHouse() {
        System.out.println("Chó đang giữ nhà");
    }
}

