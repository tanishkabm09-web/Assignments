package queues;
import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> orders = new LinkedList<>();
        //for adding - add() [fail][strict]], offer() [not fail][not strict]
        orders.add("Order101");//strict capacity based
        orders.offer("Order102");//flexible
        System.out.println("Orders: " + orders);
        //for removal: remove() -> Strict[fail] poll() not strict[not fail]
        System.out.println("Serving:" + orders.poll());
        System.out.println("Pending order:" + orders);

    }
}
