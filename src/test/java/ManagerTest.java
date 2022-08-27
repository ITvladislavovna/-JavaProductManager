import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void setup() {
        ProductRepository product = new ProductRepository();
        Product product1 = new Product(52, "Война и мир", 400);
        Product product2 = new Product(13, "Анна каренина", 400);
        Product product3 = new Product(2, "iPhone 13", 100_000);
        Product product4 = new Product(10, "iPad", 120_000);

        ProductManager manager = new ProductManager(product);
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(product4);


        Product[] expected = {product2};
        Product[] actual = manager.searchBy("Анна");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void setupOne() {
        ProductRepository product = new ProductRepository();
        Product product1 = new Product(52, "Война и мир", 400);
        Product product2 = new Product(13, "Анна каренина", 400);
        Product product3 = new Product(2, "iPhone 13", 100_000);
        Product product4 = new Product(10, "iPad", 120_000);

        ProductManager manager = new ProductManager(product);
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(product4);


        Product[] expected = {};
        Product[] actual = manager.searchBy("Ваня");

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void setupTwo() {
        ProductRepository product = new ProductRepository();
        Product product1 = new Product(52, "Война и мир", 400);
        Product product2 = new Product(13, "мир", 400);
        Product product3 = new Product(2, "iPhone 13", 100_000);
        Product product4 = new Product(10, "iPad", 120_000);

        ProductManager manager = new ProductManager(product);
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(product4);


        Product[] expected = {product1,product2};
        Product[] actual = manager.searchBy("мир");

        Assertions.assertArrayEquals(expected, actual);
    }
}
