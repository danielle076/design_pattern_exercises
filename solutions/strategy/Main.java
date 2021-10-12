package solutions.strategy;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1, "product 1", 12.99);
        Product product2 = new Product(2, "product 2", 10.99);
        Product product3 = new Product(3, "product 3", 1.99);
        Product product4 = new Product(4, "product 4", 8.99);
        Product product5 = new Product(5, "product 5", 18.99);

        ProductList list = new ProductList();
        list.addProduct(product2);
        list.addProduct(product1);
        list.addProduct(product3);
        list.addProduct(product5);
        list.addProduct(product4);

        System.out.println(list.getProducts());

        list.setSortingStrategy(new NameSortingStrategy());
        System.out.println(list.getProducts());

        list.setSortingStrategy(new PriceSortingStrategy());
        System.out.println(list.getProducts());
    }
}
