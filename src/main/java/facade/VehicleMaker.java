package facade;

public class VehicleMaker {
    private Vehicle car;
    private Vehicle boat;

    public VehicleMaker(){
        car = new Car();
        boat = new Boat();
    }

    public void infoCar(){
        car.info();
    }

    public void infoBoat(){
        boat.info();
    }
}
