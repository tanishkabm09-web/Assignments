package threads;

public class TicketTask implements Runnable {
    String task;
    TicketTask(String task){
        this.task = task;
    }
    public void run(){
        System.out.println(task + " in progress.");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new TicketTask("Seat Assignment"));
        Thread t2 = new Thread(new TicketTask("Payment Processing"));
        Thread t3 = new Thread(new TicketTask("SMS Notification"));
        t1.start();
        t2.start();
        t3.start();
    }


    }
    /* points to remember
    ℹ️Each runnable object is a job, and the thread class is responsible only execution, which makes this approach cleaner and more flexible.
    ⭐implements Runnable
    ⭐Better design
    ⭐Interviews mostly ask this
    ⭐Supports multiple inheritance via interfaces
     */



