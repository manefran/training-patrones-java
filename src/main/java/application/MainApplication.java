package application;

import abstractFactory.AbstractFactoryApplication;
import abstractFactory.BirdFactory;
import abstractFactory.DogFactory;
import abstractFactory.PetFactory;
import bridge.DevStudent;
import bridge.JavaStudy;
import bridge.Student;
import decorator.ItalianPizza;
import decorator.Pizza;
import decorator.TomatoDecorator;
import facade.VehicleMaker;
import factoryMethod.Vehicle;
import factoryMethod.VehicleFactory;
import iterator.Pet;
import iterator.PetIterator;
import prototype.Bird;
import prototype.Dog;
import strategy.Context;
import strategy.OperationAdd;
import strategy.OperationSubstract;
import template.Football;
import template.Game;
import template.Tennis;

public class MainApplication {

    private static AbstractFactoryApplication configureApplication(String typePet){
        AbstractFactoryApplication app;
        PetFactory factory;

        if (typePet.equalsIgnoreCase("dog")){
            factory = new DogFactory();
            app = new AbstractFactoryApplication(factory);
        }else{
            factory = new BirdFactory();
            app = new AbstractFactoryApplication(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        //AbstractFactory
        AbstractFactoryApplication app = configureApplication("Dog");
        System.out.println(String.format("Name: %s  Sound: %s", app.name(), app.sound()));

        //FactoryMethod
        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicleCar = factory.getVehicle("car");
        Vehicle vehicleBoat = factory.getVehicle("boat");
        vehicleCar.Type();
        vehicleBoat.Type();

        //Prototype
        Dog dog = new Dog();
        dog.setName("Pixell");
        dog.setSound("Guau guau");
        Dog anotherDog = (Dog) dog.clone();

        Bird bird = new Bird();
        bird.setName("Niko");
        bird.setSound("Fuii fuii");
        Bird anotherBird = (Bird) bird.clone();

        System.out.println(String.format("Dog Original => name: %s, sound: %s, type: %s", dog.getName(),dog.getSound(),dog.getType()));
        System.out.println(String.format("Clone Dog => name: %s, sound: %s, type: %s", anotherDog.getName(),anotherDog.getSound(),anotherDog.getType()));
        System.out.println(String.format("Bird Original => name: %s, sound: %s, type: %s", bird.getName(),bird.getSound(),bird.getType()));
        System.out.println(String.format("Clone Bird => name: %s, sound: %s, type: %s", anotherBird.getName(),anotherBird.getSound(),anotherBird.getType()));

        //Decorator
        Pizza italianPizza = new ItalianPizza();
        Pizza tomatoPizza = new TomatoDecorator(new ItalianPizza());

        italianPizza.info();
        tomatoPizza.info();

        //Bridge
        Student devStudent = new DevStudent(new JavaStudy());
        devStudent.study();

        //Facade
        VehicleMaker vehicleMaker = new VehicleMaker();
        vehicleMaker.infoCar();
        vehicleMaker.infoBoat();

        //Template
        Game game = new Tennis();
        game.play();
        game = new Football();
        game.play();

        //Iterator
        Pet[] pets = {new Pet("Pixell"),new Pet("Niko"), new Pet("Roco")};
        PetIterator petIterator = new PetIterator(pets);

        for (PetIterator it = petIterator; it.hasNext(); ) {
            Pet pet = it.next();
            System.out.println("Pet name: " + pet.getName());
        }

        //Strategy
        Context context = new Context(new OperationAdd());
        System.out.println("2 + 3 = " + context.executeStrategy(2, 3));

        context = new Context(new OperationSubstract());
        System.out.println("7 - 3 = " + context.executeStrategy(7, 3));

    }
}
