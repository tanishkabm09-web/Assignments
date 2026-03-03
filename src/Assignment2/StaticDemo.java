package Assignment2;


class StaticDemo {

        static int count = 0;

        StaticDemo() {
            count++;
        }

        static void showCount() {
            System.out.println("Count: " + count);
        }

        public static void main(String[] args) {
            new StaticDemo();
            new StaticDemo();
            StaticDemo.showCount();
        }
    }


