package BasicOops;
// Ploymorphism Example

public class Animals {
    void sound(){
        System.out.println("Animals makes Sound");
    }
}

class dog extends Animals{
    @Override
    void sound(){
        System.out.println("Dog barks !!");
    }
}

class Main{
    public static void main(String[] args) {
        Animals a = new dog();
        a.sound();
    }
}
