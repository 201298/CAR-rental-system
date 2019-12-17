package carrentalsystem;

public class Person {

    private String name;
    private int PhoneNumber;
    private int SSN;
    private Address address;

    public Person(String name, int PhoneNumber, int SSN, Address address) {
        super();
        this.name = name;
        this.PhoneNumber = PhoneNumber;
        this.SSN = SSN;
        this.address = address;

    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", PhoneNumber=" + PhoneNumber + ", SSN=" + SSN + ", address=" + address + '}';
    }

}
