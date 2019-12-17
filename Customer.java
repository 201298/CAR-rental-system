/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalsystem;

public class Customer extends Person {

    private long creditCard;

    public Customer(String fname, String lname, int PhoneNumber, long SSN, String address, long creditCard) {
        super();
        this.fname = fname;
        this.lname = lname;
        this.PhoneNumber = PhoneNumber;
        this.SSN = SSN;
        this.address = address;
        this.creditCard = creditCard;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return "First name is: " + fname + " ,Last name is: " + lname + " ,PhoneNumber is: " + PhoneNumber
                + " ,SSN is: " + SSN + " ,Address is: " + address + " ,CreditCardNumber is: " + creditCard;
    }

}
