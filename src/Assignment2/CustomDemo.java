package Assignment2;

public class CustomDemo {


        static void check(int n) throws MyException {
            if (n < 0)
                throw new MyException("Negative number not allowed");
        }

        public static void main(String[] args) {
            try {
                check(-5);
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
    }

