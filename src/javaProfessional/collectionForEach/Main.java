package javaProfessional.collectionForEach;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Husky", 55555);
        Animal cat = new Animal("Sphynx", 40000);
        Animal bird = new Animal("Crow", 2500);

        Animal[] c = {cat, dog, bird};

        for (Animal tmp: c) {
            tmp.price = tmp.price + 1000;
        }
        for (Animal tmp : c) {
            System.out.println(tmp.breed + " " + tmp.price);
        }
    }
}
