package collection;
import java.util.ArrayList;
import java.util.Collection;


public class LiveOrders {
    public static void main(String[] args) {
        Collection<String> liveOrders = new ArrayList<>();

        liveOrders.add("ORD101");
        liveOrders.add("ORD102");
        liveOrders.add("ORD103");
        System.out.println("ORD103 exists?" + liveOrders.contains("ORD103"));
        System.out.println("Live Orders" + liveOrders);
        liveOrders.clear();
        System.out.println("Orders after cleaning" + liveOrders);

    }

}
