import java.util.Scanner;

class Student5 {

    int rank;
    int marks;
    int totalMarks;

    Student5 input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rank: ");
        rank = sc.nextInt();

        System.out.print("Enter Marks Obtained: ");
        marks = sc.nextInt();

        System.out.print("Enter Total Marks: ");
        totalMarks = sc.nextInt();

        return this;
    }

    Student5 rank() {
        System.out.println("Rank: " + rank);
        return this;
    }

    Student5 marks() {
        System.out.println("Marks: " + marks + "/" + totalMarks);
        return this;
    }

    Student5 percentage() {
        double per = (marks * 100.0) / totalMarks;
        System.out.println("Percentage: " + per + "%");
        return this;
    }
}

public class MethodChaining {

    public static void main(String[] args) {

        Student5 s = new Student5();

        s.input()
                .rank()
                .marks()
                .percentage();
    }
}
