package solutions.strategy;

import java.util.Comparator;
import java.util.List;

public class PriceSortingStrategy implements SortingStrategy {

    @Override
    public List<Product> sort(List<Product> products) {
        products.sort(Comparator.comparingDouble(p -> p.price));
        return products;
    }
}
