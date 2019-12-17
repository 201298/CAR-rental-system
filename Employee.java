package rentalsystem;

public class Employee extends Person {

    private String titel;
    private double salary;

    public Employee() {
    }

    public Employee(String fname, String lname, int PhoneNumber, int SSN, String address, String titel, double salary) {
        super(fname, lname, PhoneNumber, SSN, address);
        this.fname = fname;
        this.lname = lname;
        this.PhoneNumber = PhoneNumber;
        this.SSN = SSN;
        this.address = address;
        this.titel = titel;
        this.salary = salary;
    }

    public Employee(String titel, double salary) {
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
        return "First name is: " + fname + " ,Last name is: " + lname + " ,PhoneNumber is: " + PhoneNumber
                + " ,SSN is: " + SSN + " ,Address is: " + address + "Employee{" + "titel=" + titel + ", salary=" + salary + '}';
    }

    /**
     *
     * @param fname
     */
    @Override
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     *
     * @param lname
     */
    @Override
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     *
     * @param PhoneNumber
     */
    @Override
    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     *
     * @param SSN
     */
    @Override
    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    /**
     *
     * @param address
     */
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

}
