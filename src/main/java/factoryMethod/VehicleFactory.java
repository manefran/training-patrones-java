package factoryMethod;

public class VehicleFactory {
    public Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("CAR"))
            return new Car();
        else
            return new Boat();
    }
}
