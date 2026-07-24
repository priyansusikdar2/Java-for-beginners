interface Father {
    void money();
}

interface Mother {
    void care();
}

class Child implements Father, Mother {

    public void money() {
        System.out.println("Father gives money");
    }

    public void care() {
        System.out.println("Mother takes care");
    }

    void study() {
        System.out.println("Child studies");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        Child c = new Child();

        c.money();
        c.care();
        c.study();
    }
}
