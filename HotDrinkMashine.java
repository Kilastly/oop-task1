import java.util.ArrayList;
import java.util.List;
public class HotDrinkMashine implements ProductMachine {
    List<Product> listProducts = new ArrayList<Product>();
    List<HotDrink> listHotDrinks = new ArrayList<HotDrink>();
    
    public void initProducts(List<Product> listProd){
        this.listProducts = listProd;
    }
    public void initHotDrink(List<HotDrink> listHotDrinks){
        this.listHotDrinks = listHotDrinks;
    }
    public Product getProduct(String name){
        for (Product prod : listProducts) {
            if (prod.getName().equals(name)){
                return prod;
                }
            }
        return null;
    }
    public HotDrink geProduct(String name, int volume, int temperature){
        for (HotDrink product : listHotDrinks) {
            if (product.getName().equals(name)||product.getVolume()== volume||product.getTemperature() == temperature){
                return product;
            }
        }
        return null;
    }
}