package carrentalsystem;

public class Customer extends Person {

    private String creditCard;

    public Customer(String creditCard, String name, int PhoneNumber, int SSN, Address address) {
        super(name, PhoneNumber, SSN, address);
        this.creditCard = creditCard;
    }

    public Customer(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return "Customer{" + "creditCard=" + creditCard + '}';
    }

    public void printCustomerData() {

    }
}
