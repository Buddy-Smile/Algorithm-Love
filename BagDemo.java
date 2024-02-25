public class BagDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(1); // Customer number 1
        cart.add(new Item("Can of Soup", 4.00));
        // Add more items as needed
        displayBag(cart);
    }

    public static void displayBag(ShoppingCart cart) {
        System.out.println("Customer Number: " + cart.getCustomerNumber());
        for (Item item : cart.toArray()) {
            System.out.println(item);
        }
    }
}