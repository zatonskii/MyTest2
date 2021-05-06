package ru.zatonskii.test4;

public class Methods {
    public static void main(String[] args) {
        function();
        function("Duck");
        function(1);
        function(3.14);
        function("B", 2);
        function(3, "C");
        System.out.println(function("Real ", "Madrid!"));
    }

    static void function() {
        System.out.println("Hello, Java");
    }
    static void function(String s) {
        System.out.println(s);
    }static void function(int i) {
        System.out.println(i);
    }static void function(double d) {
        System.out.println(d);
    }static void function(String s, int i) {
        System.out.println(s + i);
    }static void function(int i, String s) {
        System.out.println(i + s);
    }static String function(String s, String b) {
        halaMadrid("Hala Madrid!");
        return s + b;
    }
    static void halaMadrid(String z) {
        System.out.println(z);
    }
}
