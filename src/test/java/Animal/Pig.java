package Animal;

public class Pig extends Animal {
    @Override
    public void makeSound() {
        System.out.println("hrum hrum");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
