import java.util.List;

public interface ProductMachine {
    public void initProducts(List<Product> listProd);
    public Product getProduct(String name);
}