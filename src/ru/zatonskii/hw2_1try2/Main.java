package ru.zatonskii.hw2_1try2;

public class Main {
    public static void main(String[] args) {
        Cat dragonCat = new Cat("i can run!", "i can jump!");
        Human svarweg = new Human("бегололо!", "прыгололо!");
        Robot t1000 = new Robot("i`m a run!", "i`m a jump!");

        System.out.println("Кот сказал: " + dragonCat.run + " - и добавил: " + dragonCat.jump);
        System.out.println("Сварщег сказал: " + svarweg.run + " - и добавил: " + svarweg.jump);
        System.out.println("Терминатор сказал: " + t1000 .run + " - и добавил: " + t1000 .jump);
    }
}
