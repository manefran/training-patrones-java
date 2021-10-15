package abstractFactory;

public class AbstractFactoryApplication {
    private Pet pet;

    public AbstractFactoryApplication(PetFactory factory){
        pet = factory.createPet();
    }

    public String name(){
        return pet.name();
    }

    public String sound(){
        return pet.sound();
    }
}
