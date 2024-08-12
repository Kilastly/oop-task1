
public abstract class Product {
    protected String name;
    protected double cost;
    protected int temperature;
    protected int volume;
    public Product(String name, double cost){
        this.name = name;
        this.cost = cost;
    }
    // public Product(String name, double cost, int temperature){
    //     this.name = name;
    //     this.cost = cost;
    //     this.temperature = temperature;
    // }
    public Product(){}

    public String getName(){
        return name;
    }
    public double getCost(){
        return cost;
    }
    @Override
    public String toString() {
        return String.format("Товар: %s, Цена: %.2f", name, cost);
    }
}
