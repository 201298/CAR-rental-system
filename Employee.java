package carrentalsystem;

public class Employee extends Person {

    private String titel;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int PhoneNumber, int SSN, Address address, String titel, double salary) {
        super(name, PhoneNumber, SSN, address);
        this.titel = titel;
        this.salary = salary;

    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "titel=" + titel + ", salary=" + salary + '}';
    }

    public void printEmployeeData() {

    }
}
