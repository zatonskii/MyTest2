package ru.zatonskii.privateConstructor;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Animal(7, "Дракот");
        Animal cat2 = new Animal(11, "Перчикот");

        System.out.println("кот " + cat1.name + " " + cat1.age + " лет");
        System.out.println("кот " + cat2.name + " " + cat2.age + " лет");
    }

}
