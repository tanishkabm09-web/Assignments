package interfaces;

interface InterfaceConcept {
    void display();
}

class A{
}
class B{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        //Old Java Code - Boring Code : Boilerplate Code
        InterfaceConcept obj = new InterfaceConcept(){
            public void display(){
                System.out.println("Hello");
            }
        };
        // java 8 or 1.8 : Lambda Expressions (Scala)
        InterfaceConcept obj2 = () ->System.out.print("Hello");
    }
}
