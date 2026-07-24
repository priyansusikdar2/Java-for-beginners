class Animal8 {
    String color = "White";
}

class Dog8 extends Animal8 {
    String color = "Black";

    void display() {
        System.out.println("Dog Color: " + color);
        System.out.println("Animal Color: " + super.color);
    }
}

public class SuperVariableDemo {
    public static void main(String[] args) {
        Dog8 d = new Dog8();
        d.display();
    }
}
