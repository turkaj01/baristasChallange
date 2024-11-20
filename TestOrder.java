public class TestOrder {
    public static void main(String[] args) {

        //Create 2 orders for unspecified guests. Do not specify a name.
        Order order1 = new Order();
        Order order2 = new Order();


        //Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("Cindhuri");
        Order order4 = new Order("Jimmy");
        Order order5 = new Order("Noah");


        Item item1 = new Item("drip coffee", 2.2);
        Item item2 = new Item("cappuccino", 3.2);
        Item item3 = new Item("latte", 3.4);
        Item item4 = new Item("espresso", 2.5);
        Item item5 = new Item("muffin", 2.5);

        //Add at least 2 items to each of the orders using the addItem method.
        order1.addItem(item1);
        order1.addItem(item2);
        order2.addItem(item3);
        order2.addItem(item4);
        order3.addItem(item5);
        order3.addItem(item1);
        order4.addItem(item2);
        order4.addItem(item3);
        order5.addItem(item4);
        order5.addItem(item5);


        //Test your getStatusMessage method by setting some orders to ready and printing the messages for each order.
        order1.setReady(true);
        order2.setReady(false);
        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());

        //Test the total by printing the return value like so: 'System.out.println(order1.getOrderTotal())'.
        System.out.println("Your total is: $" + order1.getOrderTotal());


        System.out.println();
        order1.display();
        System.out.println();
        order2.display();
        System.out.println();
        order3.display();
        System.out.println();
        order4.display();
        System.out.println();
        order5.display();
    }
}
