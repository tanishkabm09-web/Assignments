package threads;

public class ThreadWithPriority extends Thread{
        public void run(){
            for (int i=1; i<=3; i++){
                System.out.println(Thread.currentThread().getName() +
                        " | Priority: " +
                        Thread.currentThread().getPriority());

            }
        }

    public static void main(String[] args){
        ThreadWithPriority t1 = new ThreadWithPriority();
        ThreadWithPriority t2 = new ThreadWithPriority();
        ThreadWithPriority t3 = new ThreadWithPriority();
        t1.setName("Low Priority Thread");
        t2.setName("Medium Priority Thread");
        t3.setName("High Priority Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }




}
/*
ℹ️Points to remember
⭐Thread priority is only a suggestion to the JVM or the scheduler.
⭐Higher Priority doesn' t guarantee execution order.
⭐Higher Priority threads may get more CPU scheduler time.
⭐The actual behavior depends on the JVM & Operating System.
 */
