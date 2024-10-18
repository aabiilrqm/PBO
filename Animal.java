abstract class Animal {
    protected int leg;

    Animal(int legInput) {
        leg = legInput;
    }

    void walk() {
        System.out.println("sedang berjalan");
    }

    void eat() {
        System.out.println("sedang makan");
    }
}
