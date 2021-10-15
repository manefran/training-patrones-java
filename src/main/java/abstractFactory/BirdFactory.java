package abstractFactory;

public class BirdFactory implements PetFactory {
    @Override
    public Pet createPet() {
        return new Bird();
    }
}
