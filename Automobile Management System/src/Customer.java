public class Customer extends Person {

    public Customer(String name, String address, int phone) {
        super(name, address, phone);
    }

    public boolean placeOrder() {
        return true;
    }
}
