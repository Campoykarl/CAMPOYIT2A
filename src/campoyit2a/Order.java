
package campoyit2a;

import java.time.LocalDate;
import java.util.ArrayList;


public class Order {
    
   


    private int orderId;
    private String customerName;
    private String orderDate;
    private double orderAmount;
    private String orderStatus;

    public Order(int orderId, String customerName, String orderDate, double orderAmount, String orderStatus) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.orderStatus = orderStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}

class OrderManager {
    private ArrayList<Order> orders;

    public OrderManager() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void viewOrders() {
        System.out.println("Order ID\tCustomer Name\tOrder Date\tOrder Amount\tOrder Status");
        for (Order order : orders) {
            System.out.println(order.getOrderId() + "\t" + order.getCustomerName() + "\t" + order.getOrderDate() + "\t" + order.getOrderAmount() + "\t" + order.getOrderStatus());
        }
    }
}



