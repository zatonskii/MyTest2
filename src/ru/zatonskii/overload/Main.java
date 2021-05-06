package ru.zatonskii.overload;

public class Main {
    public static void main(String[] args) {
        Animal animalDefault = new Animal();
        Animal animalWithOneParameter = new Animal(32);
        Animal animalWithTwoParameter = new Animal(27, 165);

        System.out.println("Age: " + animalDefault.getAge() + "; Height:" + animalDefault.getHeight());
        System.out.println("Age: " + animalWithOneParameter.getAge() + "; Height:" + animalWithOneParameter.getHeight());
        System.out.println("Age: " + animalWithTwoParameter.getAge() + "; Height:" + animalWithTwoParameter.getHeight());
    }
}
