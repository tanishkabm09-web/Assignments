package garbageCollection;

    public class Test {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object destroyed!");
        }

        public static void main(String[] args) {
            garbageCollection.Test t = new garbageCollection.Test();
            t = null;
            for (int i = 1; i < 100; i++) {
                System.gc();
            }
        }
    }
