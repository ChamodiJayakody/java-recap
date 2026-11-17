public class ShoppingBill {
    public static void main(String[] args){

        double price = 450.00;
        int quantity = 3;
        double subtotal = price * quantity;
        final int DISCOUNT_RATE = 10;

        System.out.println("Item price \t: "+ price);
        System.out.println("Quantity \t: "+ quantity);
        System.out.println("Subtotal \t: "+ subtotal);
        System.out.println("Discount \t: "+ (subtotal * DISCOUNT_RATE / 100));
        System.out.println("Total \t\t: "+ (subtotal - (subtotal * DISCOUNT_RATE / 100)));
    }
}
