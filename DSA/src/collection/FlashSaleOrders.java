package collection;

import java.util.ArrayList;
import java.util.Collection;


public class FlashSaleOrders {
    public static void main(String[] args) {
        Collection<Integer> orderIds = new java.util.ArrayList<>();
        orderIds.add(101);
        orderIds.add(102);
        orderIds.add(103);
        System.out.println("Orders recieved:" + orderIds);
        System.out.println("No of orders:" + orderIds.size());

    }
}
