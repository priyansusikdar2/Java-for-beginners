// Abstract class
abstract class Animal10 {

    // Abstract method
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Child class
class Dog10 extends Animal10 {

    // Implementing abstract method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class AB {
    public static void main(String[] args) {
        Dog10 d = new Dog10();
        d.sound();
        d.eat();
    }
}
