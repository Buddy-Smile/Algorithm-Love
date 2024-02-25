public class ShoppingCart {
    private Item[] myBag;
    private int numberOfProducts;
    private static final int DEFAULT_CAPACITY = 10;
    private int customerNumber;

    public ShoppingCart(int customerNumber) {
        this.myBag = new Item[DEFAULT_CAPACITY];
        this.numberOfProducts = 0;
        this.customerNumber = customerNumber;
    }

    public boolean add(Item item) {
        if (!isFull()) {
            myBag[numberOfProducts++] = item;
            return true;
        }
        return false;
    }

    public Item[] toArray() {
        return java.util.Arrays.copyOf(myBag, numberOfProducts);
    }

    public boolean isFull() {
        return numberOfProducts == myBag.length;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }
}
