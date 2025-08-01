package BasicOops;
// Abstraction Example

abstract public class Vehicle {
    abstract void move();              // abstract method
    void start(){
        System.out.println("Vehicle Started");
    }
}

class car extends Vehicle{
    void move(){
        System.out.println("Car is moving !!");
    }

    public static void main(String[] args) {
        car c = new car();
        c.move();
        c.start();
        System.out.println("-----------------------------------------------------------------");
        Vehicle v = new car();
        v.move();
        v.start();
    }
}


