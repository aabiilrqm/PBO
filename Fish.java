public class Fish extends Animal implements Pet {
    String name;

    Fish(String input) {
        super(0);
        name = input;
    }

    @Override
    public void getName() {
        System.out.println("Fish Name : " + this.name);
    }

    @Override
    public void setName(String n) {
        name = n;
    }

    @Override
    public void play() {
        System.out.println(this.name + " sedang bermain");
    }
}