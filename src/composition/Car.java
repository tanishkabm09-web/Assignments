package composition;

class Engine {
    void start() {
        System.out.println("Engine starts!");
    }
}
public class Car {
    private Engine engine;
     void car(){
        //Engine class object will be createdhere
        engine = new Engine(); //Tight coupling
    }
    void drive(){
        engine.start();
        System.out.println("Car is moving");

    }
    public static void main(String[] args){
        Car car = new Car();
        car.drive();
    }
}
