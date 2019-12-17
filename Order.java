package rentalsystem;

import java.util.Date;

public class Order {

    private Car car;
    private Date RentDate;
    private Date DateReturn;
    private double totalCost;

    public Order() {

    }

    public Order(Car car, Date RentDate, Date DateReturn, Customer customer, Employee employee, double totalCost) {
        this.car = car;
        this.RentDate = RentDate;
        this.DateReturn = DateReturn;
        this.totalCost = totalCost;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getRentDate() {
        return RentDate;
    }

    public void setRentDate(Date RentDate) {
        this.RentDate = RentDate;
    }

    public Date getDateReturn() {
        return DateReturn;
    }

    public void setDateReturn(Date DateReturn) {
        this.DateReturn = DateReturn;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Order{" + "car=" + car + ", RentDate=" + RentDate + ", DateReturn=" + DateReturn
                + ", totalCost=" + totalCost + '}';
    }

}
