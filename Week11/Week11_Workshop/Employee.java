package Week11_Workshop;

//there is no default constructor available in Person
public class Employee extends Person {
    private String department;
    private double salary;

    public Employee(String name, int age, String address, String department, double salary) {
        super(name, age, address);
        this.department = department;
        this.salary = salary;

    }
}
