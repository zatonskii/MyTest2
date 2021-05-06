package ru.zatonskii.classObject1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1);
        Car car2 = new Car(2);
        Car car3 = car1;

        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
        System.out.println(car1 == car2);
        System.out.println(car1 == car3);
    }
}
