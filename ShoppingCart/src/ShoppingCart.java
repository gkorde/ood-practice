import java.util.HashMap;

class ShoppingCart implements Cart {

    HashMap<Items, Integer> list = new HashMap<>();
    @Override
    public void addItems(Items item) {
        list.put(item, item.price);
    }

    @Override
    public int checkDiscount(Items item) {

        return 0;
    }
}

class Bread implements Items {

    void Bread(int price, int count) {
        this.price = price;
        this.count = count;
    }
    @Override
    public void discount(Items item) {
        if (count > 0) {
            count += count;
        }
    }
}

class Milk implements Items {

    void Milk(int price, int count) {
        this.price = price;
        this.count = count;
    }
    @Override
    public void discount(Items item) {

    }
}