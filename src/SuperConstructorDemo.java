class Animal9 {
    Animal9() {
        System.out.println("Animal Constructor Called");
    }
}

class Dog9 extends Animal9 {
    Dog9() {
        super();   // Calls parent class constructor
        System.out.println("Dog Constructor Called");
    }
}

public class SuperConstructorDemo {
    public static void main(String[] args) {
        Dog9 d = new Dog9();
    }
}
