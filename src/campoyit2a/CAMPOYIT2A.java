
package campoyit2a;

import java.util.Scanner;

public class CAMPOYIT2A {

   
public static void main (String [] args){
   Scanner sc =  new Scanner (System.in);
 OrderManager orderManager = new OrderManager();

        System.out.print("Enter number of orders: ");
        int numorders = sc.nextInt();
        sc.nextLine(); 
int i;
        for ( i = 1; i <= numorders; i++) {
            System.out.println("Enter details of order " + i + ":");
            System.out.print("Order ID: ");
            int orderId = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Customer Name: ");
            String customerName = sc.nextLine();
            System.out.print("Order Date: ");
            String orderDate = sc.nextLine();
            System.out.print("Order Amount: ");
            double orderAmount = sc.nextDouble();
            sc.nextLine(); 
            System.out.print("Order Status: ");
            String orderStatus = sc.nextLine();

       
            if (orderAmount <= 0) {
                System.out.println("Error: Order amount must be positive.");
                continue;  
            }
            if (!isValidOrderStatus(orderStatus)) {
                System.out.println("Error: Invalid order status. Valid statuses are: Pending, Shipped, Delivered, Canceled.");
                continue; 
            }

            
            Order order = new Order(orderId, customerName, orderDate, orderAmount, orderStatus);
            orderManager.addOrder(order);
        }

        orderManager.viewOrders();
    }

    private static boolean isValidOrderStatus(String orderStatus) {
        return orderStatus.equalsIgnoreCase("Pending") ||
               orderStatus.equalsIgnoreCase("Shipped") ||
               orderStatus.equalsIgnoreCase("Delivered") ||
               orderStatus.equalsIgnoreCase("Canceled");
    }
    
    


}     

   

