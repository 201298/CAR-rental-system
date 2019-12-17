package rentalsystem;

public class Person {

    String fname;
    String lname;
    int PhoneNumber;
    long SSN;
    String address;

    public Person(String fname, String lname, int PhoneNumber, long SSN, String address) {
        super();
        this.fname = fname;
        this.lname = lname;
        this.PhoneNumber = PhoneNumber;
        this.SSN = SSN;
        this.address = address;

    }

    public Person() {
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "fname=" + fname + ", lname=" + lname + ", PhoneNumber=" + PhoneNumber + ", SSN=" + SSN + ", address=" + address + '}';
    }

}
