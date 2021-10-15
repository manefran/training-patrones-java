package decorator;

public class ItalianPizza implements Pizza{
    @Override
    public void info() {
        System.out.println("Pizza: Italian");
    }
}
