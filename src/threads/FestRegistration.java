package threads;

public class FestRegistration {
    static class FormFilling extends Thread{
        public void run(){
            System.out.println("Form Filling Started!");
        }
    }
    static class DocumentsUpload extends Thread{
        public void run(){
            System.out.println("Document Upload Started!");
        }
    }
    static class EmailNotification extends Thread{
        public void run(){
            System.out.println("Confirmation Email Sent!");
        }
    }
    public static void main(String[] args){
        FormFilling t1 = new FormFilling();
        DocumentsUpload t2 = new DocumentsUpload();
        EmailNotification t3 = new EmailNotification();
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
points to remember
*Java program starts with one main thread.
*Threads allow parallel execution or concurrency.
*Output order is not guarantied.
*Threads share the same memory.
*Improves the performance and responsiveness.
when start() is called, the jvm creates a new Thread.
when run() is called directly, there is no concurrency
ℹ️ℹProcess vs Thread
Process is a running program
Thread is a path of execution inside the program
A process has its own memory
Thread share the same memory
Creating a thread is cheaper than creating a process
Examples: Process -> Chrome Browser Thread -> New Tab
Closing a tab will not close Chrome or kill Chrome
 */
