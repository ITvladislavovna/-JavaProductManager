import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositoryTest {
    Product product1 = new Product(52, "Война и мир", 400);
    Product product2 = new Product(13, "Анна каренина", 400);
    Product product3 = new Product(2, "iPhone 13", 100_000);
    Product product4 = new Product(10, "iPad", 120_000);

    @Test
    public void AddNew() {
        ProductRepository product = new ProductRepository();
        product.add(product1);
        product.add(product2);
        product.add(product3);
        product.add(product4);
        Product[] expected = {product1, product2, product3, product4};
        Product[] actual = product.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void removeByIdTest() {
        ProductRepository product = new ProductRepository();
        product.add(product1);
        product.add(product2);
        product.add(product3);
        product.add(product4);
        product.removeById(product3.getId());

        Product[] expected = {product1, product2, product4};
        Product[] actual = product.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addBook() {
        ProductRepository product = new ProductRepository();
        Book product1 = new Book(52, "Война и мир", 400, "Л.Н.Толстой");
        Book product2 = new Book(54, "Война и мир", 400, "Л.Н.Толстой");
        Book product3 = new Book(56, "Война и мир", 400, "Л.Н.Толстой");

        product.add(product1);
        product.add(product2);
        product.add(product3);

        Product[] expected = {product1, product2, product3};
        Product[] actual = product.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addSmartPhone() {
        ProductRepository product = new ProductRepository();
        Smartphone product1 = new Smartphone(52, "IPhone", 10_000, "Китай");
        Smartphone product2 = new Smartphone(54, "Ipad", 120_000, "Китай");
        Smartphone product3 = new Smartphone(56, "Samsung", 80_000, "Китай");

        product.add(product1);
        product.add(product2);
        product.add(product3);

        Product[] expected = {product1, product2, product3};
        Product[] actual = product.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}
