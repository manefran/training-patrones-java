package decorator;

public class TomatoDecorator extends PizzaDecorator {
    public TomatoDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public void info() {
        decoratedPizza.info();
        addTomato(decoratedPizza);
    }

    private void addTomato(Pizza decoratedPizza){
        System.out.println("Tomato add");
    }
}
