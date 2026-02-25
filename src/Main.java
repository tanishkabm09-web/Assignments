class Employee {
    int id;
    String name;
    double salary;
    static String company = "TCS";

    // Default constructor
    Employee() {
        this(0, "Not Assigned", 40000);
    }

    // Constructor with 2 parameters
    public Employee(int id, String name) {
        this(id, name, 40000);
    }

    // Constructor with 3 parameters
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}