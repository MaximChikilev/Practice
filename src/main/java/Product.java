public class Product {
    private int id;
    private String description;
    private int price;


    public Product(int id, String description, int price) {
        checkPrice(price);
        this.id = id;
        this.description = description;
        this.price = price;

    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        checkPrice(price);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                ", id=" + id +
                "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    private void checkPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("price cannot be less than 0");
        }
    }
}

