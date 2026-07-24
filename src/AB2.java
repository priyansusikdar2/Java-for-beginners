import java.util.Scanner;

abstract class Shape {

    abstract void calculateArea();

    void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    int radius;

    // Constructor
    Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextInt();
    }

    @Override
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

class Rectangle extends Shape {
    int length, breadth;

    // Constructor
    Rectangle() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        breadth = sc.nextInt();
    }

    @Override
    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
}

public class AB2 {
    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.calculateArea();

        r.display();
        r.calculateArea();
    }
}
