class Student {
    int rollNo;
    String name;

    Student() {
        System.out.println("Default Constructor Called");
    }
    Student(int r, String n) {
        rollNo = r;
        name = n;
        System.out.println("Parameterized Constructor Called");
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println();
    }
}

public class Con {
    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student(101, "Rahul");

        System.out.println("\nStudent 1 Details:");
        s1.display();

        System.out.println("Student 2 Details:");
        s2.display();
    }
}
