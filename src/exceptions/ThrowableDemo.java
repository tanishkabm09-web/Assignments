package exceptions;

public class ThrowableDemo {
    static void test() throws Throwable {
        throw new Throwable("Something went wrong!");
    }
    public static void main(String[] args){
        try {
            test();
        }catch (Throwable t){
            //Fully qualified name
            System.out.println("Handled:" + t);
            // Only the Message
            System.out.println("Handled:" + t.getMessage());
        }
    }
}
/*
throw new String("Error"); -> ❌
throw new Integer("Error"); -> ❌
throw new Throwable("Error"); -> ✅
throw new Exception("Error"); -> ✅
throw new RunTimeException("Error"); -> ✅
throw new IOException("Error"); -> ✅
 */
