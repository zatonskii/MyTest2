package ru.zatonskii.interface1;

interface intFace {
    void method();
}

    class MyClass {
    public void method() {
        System.out.println("Метод реализация интерфейса");
    }

}

public class Main {
    public static void main(String[] args) {
        MyClass my = new MyClass();

        my.method();
    }

}
