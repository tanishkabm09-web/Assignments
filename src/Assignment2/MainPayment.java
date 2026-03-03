package Assignment2;

public class MainPayment {

        public static void main(String[] args) {
            Payment p1 = new CreditCardPayment();
            Payment p2 = new UPIPayment();

            p1.pay();
            p2.pay();
        }
    }

