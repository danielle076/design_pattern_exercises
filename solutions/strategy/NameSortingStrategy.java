package solutions.strategy;

import java.util.Comparator;
import java.util.List;

public class NameSortingStrategy implements SortingStrategy {

    @Override
    public List<Product> sort(List<Product> products) {
        products.sort(Comparator.comparing(p -> p.name));
        return products;
    }
}
