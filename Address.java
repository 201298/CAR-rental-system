package carrentalsystem;

public class Address {

    private String streetName;
    private String city;
    private String country;

    public Address() {
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" + "streetName=" + streetName + ", city=" + city + ", country=" + country + '}';
    }

    public void printAddress() {

    }
}
