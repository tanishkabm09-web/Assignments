package garbageCollection;

public class GCExample {
        static void main(String[] args) {
            String s1=new String("java");
            String s2=new String("python");
            s1=s2;
            System.gc();    //Not mandatory
            //Now in the string pool,Java is not available
            //That proves that garbage collection is Automatic
            System.out.println(s1);
        }
    }

