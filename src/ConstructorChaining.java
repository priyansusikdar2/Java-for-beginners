class Student4 {

    Student4() {
        this(101);                // Calls constructor with one parameter
        System.out.println("Default Constructor");
    }

    Student4(int id) {
        this(id, "Rahul");        // Calls constructor with two parameters
        System.out.println("ID = " + id);
    }

    Student4(int id, String name) {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {

        Student4 s = new Student4();
    }
}
