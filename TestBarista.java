import java.util.ArrayList;

public class TestBarista {
	public static void main(String[] args) {

        //Create 2 orders for unspecified guests (without specifying a name)
        Order order1 = new Order();
        Order order2 = new Order();

        //Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("Maryam");
        Order order4 = new Order("Hettaf");
        Order order5 = new Order("Noura");


        //Implement the addItem method within the Order class
        Item item1 = new Item("Mocha", 14.5);
        Item item2 = new Item("Latte", 13.0);
        Item item3 = new Item("Drip Coffee", 10.5);
        Item item4 = new Item("Capuccino", 14.0);

        order1.addItem(item2);
        order1.addItem(item4);

        order2.addItem(item2);
        order2.addItem(item3);

        order3.addItem(item1);
        order3.addItem(item3);

        order4.addItem(item3);
        order4.addItem(item4);

        order5.addItem(item2);
        order5.addItem(item1);


        //Implement the getStatusMessage method within the Order class
        String msg1 = order1.getStatusMessage();
        System.out.println(msg1);


        //Test your getStatusMessage functionality by setting some orders to ready and printing the messages 
        //for each order. For example: order2.setReady(true); 
        //System.out.println(order2.getStatusMessage());
        order2.setReady(false);
        String msg2 = order2.getStatusMessage();
        System.out.println(msg2);


        //Implement the getOrderTotal method within the Order class
        double total = order1.getOrderTotal();
        System.out.println(total);

        //Implement the display method within the Order class
        //Finally, call the display method on all of your orders, like so: order3.display();
        order3.display();






	}
}
