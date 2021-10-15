package facade;

public class Car implements Vehicle{
    @Override
    public void info() {
        System.out.println("Vehicle: Car");
    }
}
