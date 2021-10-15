package prototype;

public class Bird extends Pet{
    private String type = "Bird";

    public Bird(){};

    public Bird(Bird pet){
        super(pet);
    }

    @Override
    public Pet clone() {
        return new Bird(this);
    }

    public String getType() {
        return type;
    }
}
