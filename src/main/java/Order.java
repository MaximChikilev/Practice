public class Order {
    private final Product[] products;

    public Order() {
        products = new Product[100];
    }

    @Override
    public String toString() {
        StringBuilder order = new StringBuilder();
        order.append("Order contains : \n");
        for (int counter = 0; counter <= products.length - 1; counter++) {
            if (products[counter] != null)
                order.append("Id : " + products[counter].getId() + " Product : " + products[counter].getDescription() + " price = " + products[counter].getPrice() + "\n");
        }
        order.append("Order's sum : " + calculateTotalSum());
        return order.toString();

    }

    public void addProduct(Product product) {
        for (int counter = 0; counter <= products.length - 1; counter++) {
            if (products[counter] == null) {
                products[counter] = product;
                return;
            }
        }
    }

    public Product searchProductById(int id) throws ProductNotFoundException {
        for (int counter = 0; counter <= products.length - 1; counter++) {
            if (products[counter] != null) {
                if (products[counter].getId() == id) {
                    return products[counter];
                }
            }
        }
        throw new ProductNotFoundException("Product with id = " + id + " is not exist");
    }

    public boolean removeProductById(int id) {
        for (int counter = 0; counter <= products.length - 1; counter++) {
            if (products[counter] != null) {
                if (products[counter].getId() == id) {
                    products[counter] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public int calculateTotalSum() {
        int sum = 0;
        for (int counter = 0; counter <= products.length - 1; counter++) {
            if (products[counter] != null) {
                sum += products[counter].getPrice();
            }
        }
        return sum;
    }
}
