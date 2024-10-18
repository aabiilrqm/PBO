public class Cat extends Animal implements Pet {
    String name;

    Cat(String inputName) {
        super(4);
        name = inputName;
    }

    @Override
    public void getName() {
        System.out.println("Name : " + this.name);
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