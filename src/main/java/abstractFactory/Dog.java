package abstractFactory;

public class Dog implements Pet{
    @Override
    public String name() {
        return "Pixell";
    }

    @Override
    public String sound() {
        return "Guau guau";
    }
}
