package solutions.strategy;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<Product> products;
    private SortingStrategy sortingStrategy;

    public ProductList() {
        this.products = new ArrayList<>();
    }

    public void setSortingStrategy(SortingStrategy strategy) {
        this.sortingStrategy = strategy;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public List<Product> getProducts() {
        if (sortingStrategy != null) {
            return sortingStrategy.sort(this.products);
        } else {
            return this.products;
        }
    }
}
