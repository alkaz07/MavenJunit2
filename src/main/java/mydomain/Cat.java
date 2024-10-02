package mydomain;

public class Cat extends Pet{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "мяу-мяу";
    }
}
