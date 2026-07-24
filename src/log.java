import java.util.Scanner;

class Average {
    int num1, num2, num3;
    double avg;
    void insert() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        num3 = sc.nextInt();
    }
    void average() {
        avg = (num1 + num2 + num3) / 3.00;
    }

    void display() {
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Third Number: " + num3);
        System.out.println("Average = " + avg);
    }
}

public class Log {
    public static void main(String[] args) {
        Average obj = new Average();

        obj.insert();
        obj.average();
        obj.display();
    }
}
