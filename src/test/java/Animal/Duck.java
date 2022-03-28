package Animal;

public class Duck extends Animal {

    @Override
    public void makeSound() {
        System.out.println("kwa, kwa");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
