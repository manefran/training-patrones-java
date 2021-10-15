package abstractFactory;

public class DogFactory implements PetFactory{
    @Override
    public Pet createPet() {
        return new Dog();
    }
}
