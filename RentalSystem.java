package rentalsystem;

import java.util.ArrayList;

public class RentalSystem {

    private ArrayList<Car> cars;
    private ArrayList<Employee> employees;
    private ArrayList<Customer> customers;

    public void RentalSystem() {

    }

    public void viewCars() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i));
        }

    }
}
