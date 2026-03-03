package Assignment2;

public class GCDemo {
        public void finalize() {
            System.out.println("Object destroyed");
        }

        public static void main(String[] args) {
            GCDemo obj = new GCDemo();
            obj = null;
            System.gc();
        }
    }

