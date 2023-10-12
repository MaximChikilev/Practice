public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        Product product1 = new Product(001, "Milk", 10);
        Product product2 = new Product(002, "Butter", 8);
        Product product3 = new Product(003, "Bread", 3);
        Product product4 = new Product(004, "Potato", 2);
        Product product5 = new Product(005, "Tomato", 11);
        // Product product6 = new Product(006,"Vodka",-70);

        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);
        order.addProduct(product4);
        order.addProduct(product5);
        System.out.println(order.toString());

        try {
            System.out.println(order.searchProductById(3).toString());
            if (order.removeProductById(3)) {
                System.out.println("Product has deleted");
            } else {
                System.out.println("Product hasn't deleted");
            }
            System.out.println(order.toString());
            //order.searchProductById(3);

        } catch (ProductNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
