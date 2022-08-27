public class ProductRepository {
    protected Product[] open = new Product[0];

    public void add(Product product) {
        Product[] tmp = new Product[open.length + 1];
        for (int i = 0; i < open.length; i++) {
            tmp[i] = open[i];
        }
        tmp[tmp.length - 1] = product;
        open = tmp;
    }

    public void removeById(int id) {
        Product[] tmp = new Product[open.length - 1];
        int copyToIndex = 0;
        for (Product product : open) {
            if (product.getId() != id) {
                tmp[copyToIndex] = product;
                copyToIndex++;
            }
        }
        open = tmp;
    }

    public Product[] findAll() {
        return open;
    }
}
