public class Main {
    public static void main(String[] args) {
        Cat kucing = new Cat("Daijin");
        Fish ikan = new Fish("Sakana");

        kucing.getName();
        kucing.setName("Abu");
        kucing.getName();
    }
}