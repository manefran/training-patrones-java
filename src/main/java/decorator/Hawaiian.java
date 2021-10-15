package decorator;

public class Hawaiian implements Pizza{
    @Override
    public void info() {
        System.out.println("Pizza: Hawaiian");
    }
}
