import java.util.ArrayList;
import java.util.List;

public class MachinWater implements ProductMachine {
    List<Product> listProducts = new ArrayList<Product>();
    
    public void initProducts(List<Product> listProd){
        this.listProducts = listProd;
    }
    public Product getProduct(String name){
        for (Product prod : listProducts) {
            if (prod.getName().equals(name)){
                return prod;
                }
            }
        return null;
    }
}
