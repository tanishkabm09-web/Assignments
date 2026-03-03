package finalKeyword;

public class Example2 {
    //If we don't initialize a final variable,
    //where is it initialized? = Constructor
    final int x;
    //If we don't initialize a static final variable,
    //where is it initialized? =
    static final int y;
    Example2(){
        x = 200;
    }
    public static void main(String[] args) {
        //Object is must for IIB output

    }
    static {
        y = 100;
        System.out.println("Start");
        System.out.println("DB-Start");
        System.out.println("Internet-Start");
        System.out.println("Load Files");
    }
    {
        System.out.println("IIB2");
    }
}
