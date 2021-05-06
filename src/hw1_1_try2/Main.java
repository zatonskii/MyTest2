package hw1_1_try2;

public class Main {
    public static void main(String[] args) {
        Calculate();
        CheckThis(7,1);
        CheckPlus(-1);
        CheckPlusTrueOrFalse(25);
        PrintName("Max");
    }
    public static void Calculate(){
        System.out.println("\nЗадание 3.");
        float a = 2, b = 3, c = 10, d= 5, z  = a * (b + (c / d));
        System.out.println(z);
    }
    static void CheckThis(int x, int v) {
        System.out.println("\nЗадание 4.");
        int t = v + x;
        if (t > 10 && t < 20)
            System.out.println("True");
        else { System.out.println("false");
        }
    }
    static void CheckPlus(int q) {
        System.out.println("\nЗадание 5.");
        if (q >= 0)
            System.out.println("Число положитеьное");
        else { System.out.println("Число отрицательное");
        }
    }
    static void CheckPlusTrueOrFalse(int w) {
        System.out.println("\nЗадание 6.");
        if (w >= 0)
            System.out.println("True");
        else { System.out.println("False");
        }
    }
    public static void PrintName(String yorName) {
        System.out.println("\nЗадание 7.");
        System.out.println("Hello, " + yorName);
    }
}
