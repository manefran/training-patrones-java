package abstractFactory;

public class Bird implements Pet {
    @Override
    public String name() {
        return "Niko";
    }

    @Override
    public String sound() {
        return "Fuii fuii";
    }
}
