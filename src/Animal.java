public class Animal {
    String bread;

    public String getBread() {
        return bread;
    }

    public int getPrice() {
        return price;
    }

    int price;

    @Override
    public String toString() {
        return "bread:" + bread + ", price:" + price;
    }

    public Animal(String bread, int price) {
        this.bread = bread;
        this.price = price;
    }
}
