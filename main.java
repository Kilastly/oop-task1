import java.util.List;
public class main {
    public static void main(String[] args) {
        Product prod5 = new Water("NukaCola", 10.0);
        Product prod1 = new Water("Квас", 80.00);
        Product prod2 = new Water("Молоко", 650.00);
        Product prod3 = new Water("Масло", 985.00);
        Product prod4 = new Water("Яблоко", 94.00);
        HotDrink prod6 = new HotDrink("Кофе", 350, 85);
        HotDrink prod7 = new HotDrink("Чай", 250, 85);
        ProductMachine prodAuto = new MachinWater();
        prodAuto.initProducts(List.of(prod1, prod2, prod3, prod4,prod5));
        // System.out.println(prodAuto.getList());
        System.out.println(prodAuto.getProduct("NukaCola"));
        HotDrinkMashine hotAuto = new HotDrinkMashine();
        hotAuto.initHotDrink(List.of(prod6, prod7));
        System.out.println(hotAuto.geProduct("Чай", 250, 85));
    }
    
}