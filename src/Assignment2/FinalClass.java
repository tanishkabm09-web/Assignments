package Assignment2;

public class FinalClass {

        final int x = 10;

        final void display() {
            System.out.println("Final method");
        }

        public static void main(String[] args) {
            FinalClass obj = new FinalClass();
            obj.display();
            System.out.println(obj.x);
        }
    }

