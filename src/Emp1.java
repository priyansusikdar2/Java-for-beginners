import java.util.*;

class emp1 {
    int id;
    String name;
    String company_name;

    void empdetail(int id, String name, String company_name) {
        this.id = id;
        this.name = name;
        this.company_name = company_name;
    }

    void empprint() {
        System.out.println("Employee's id is " + id);
        System.out.println("Employee's name is " + name);
        System.out.println("Company's name is " + company_name);
    }
}

public class Employee {
    public static void main(String args[]) {
        emp1 e1 = new emp1();      // Create emp1 object
        e1.empdetail(101, "Rahul", "TCS");
        e1.empprint();
    }
}
