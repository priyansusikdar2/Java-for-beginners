import java.util.Scanner;

abstract class Shape {

    abstract void calculateArea();

    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {


    @Override
    void calculateArea() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int radius = sc.nextInt();

        double area = 3.14 * radius * radius;

        System.out.println("Area of Circle = " + area);
    }
}

class Rectangle extends Shape {


    @Override
    void calculateArea() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        double area = length * breadth;

        System.out.println("Area of Rectangle = " + area);
    }
}

public class AB1 {

    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.calculateArea();

        r.display();
        r.calculateArea();
    }
}
