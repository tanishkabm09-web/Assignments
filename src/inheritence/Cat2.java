package inheritence;

 public interface Cat2{
    default void sound(){
        System.out.println("hello");
    }
}
interface Dog{
    default void sound(){
        System.out.println("Woof!");
    }
}
class Cog implements Cat2,Dog{
    public void sound(){
        //ystem.out.println("Some sound");
        Dog.super.sound();
    }
}
class Demo1{
    public static void main(String[] args){
        Cog cog = new Cog();
        cog.sound();
    }
}

