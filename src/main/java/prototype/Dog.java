package prototype;

public class Dog extends Pet {

    private String type = "Dog";

    public Dog(){};

    public Dog(Dog pet) {
        super(pet);
    }

    @Override
    public Pet clone() {
        return new Dog(this);
    }

    public String getType() {
        return type;
    }
}
