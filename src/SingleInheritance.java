class Animal1 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class singleinheritance {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.eat();
        d.bark();
    }
}
