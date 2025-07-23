package Day1JavaGenerics;
interface Category {}
class BookCategory implements Category {}
class ClothingCategory implements Category {}
class GadgetCategory implements Category {}

class Product<T extends Category> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double percent) {
        price -= price * (percent / 100);
    }

    public void displayProduct() {
        System.out.println(name + " - ₹  " + price);
    }
}

class DiscountUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        product.applyDiscount(percent);
        product.displayProduct();
    }
}

class MainMarketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Book", 500);
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 800);
        Product<GadgetCategory> headphones = new Product<>("Headphones", 1500);

        System.out.println("--- Discounted Prices ---");
        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 15);
        DiscountUtil.applyDiscount(headphones, 5);
    }
}
