package java_object_class_pack;

class Order {

    int orderId;
    String customerName;
    double amount;
    double tax;

    Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        this.customerName = "Guest";
        this.tax = amount * 0.10;   
    }

    Order(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        this.tax = amount * 0.10;   
    }

    void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Amount: " + amount);
        System.out.println("Tax: " + tax);
        System.out.println("Total Amount: " + (amount + tax));
    }

    public static void main(String[] args) {

        Order o1 = new Order(101, 1000);
        o1.display();

        System.out.println();

        Order o2 = new Order(102, "Hari", 2000);
        o2.display();
    }
}

