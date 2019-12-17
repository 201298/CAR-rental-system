package rentalsystem;

import java.util.Scanner;
import java.util.Date;
import java.io.BufferedWriter;
import java.io.FileWriter;
//import java.io.Filereder;
import java.io.IOException;

public class CarRentalSystem {

    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter File Name: ");
        String file = reader.next();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            Car c1 = new Car();
            c1.setModel(2018);
            c1.setName("Chevorlet Lanos   ");
            c1.setColor("   Grey  ");
            c1.setPricePerDay(1100);

            Car c2 = new Car();
            c2.setModel(2017);
            c2.setName("Renault logan     ");
            c2.setColor("   Blue  ");
            c2.setPricePerDay(1200);

            Car c3 = new Car();
            c3.setModel(2019);
            c3.setName("BMW X6            ");
            c3.setColor("   Red   ");
            c3.setPricePerDay(1700);

            Car c4 = new Car();
            c4.setModel(2019);
            c4.setName("Toyota Crolla     ");
            c4.setColor("   White ");
            c4.setPricePerDay(1600);

            Car c5 = new Car();
            c5.setModel(2010);
            c5.setName("Kia Cerato        ");
            c5.setColor("   Black ");
            c5.setPricePerDay(1400);
            Car c6 = new Car();
            c6.setModel(2010);
            c6.setName("Haunday Verna     ");
            c6.setColor("   White ");
            c6.setPricePerDay(1100);

//            try{
//                Filereder r = new Filereder("E:\\First Semester\\Car.txt");
//                  int x;
//                  while((x=r.read())!=-1){
//                      System.out.println((char)x);
//                        }
//            }
//                  catch(Exception ex){
//                          
//                        }
            System.out.println("           Welcom To Our Car Rental System   ");
            System.out.println("-----------------------------------------------------------");
            System.out.println("This is our List of Cars");
            System.out.println("You can rent a car in minimum 1 day, and maximum 14 day ");
            System.out.println("");
            System.out.println("1- " + c1.toString());
            System.out.println("2- " + c2.toString());
            System.out.println("3- " + c3.toString());
            System.out.println("4- " + c4.toString());
            System.out.println("5- " + c5.toString());
            System.out.println("6- " + c6.toString());

            System.out.print("PLease choose Car from the list: ");
            int ChosenCar = reader.nextInt();
            if (ChosenCar > 6) {
                System.out.println("Enter from this choices");
            } else if (ChosenCar == 1) {
                System.out.println("You Chosed " + c1.toString());
                writer.write("You Chosed " + c1.toString());
            } else if (ChosenCar == 2) {
                System.out.println("You Chosed " + c2.toString());
                writer.write("You Chosed " + c2.toString());
            } else if (ChosenCar == 3) {
                System.out.println("You Chosed " + c3.toString());
                writer.write("You Chosed " + c3.toString());
            } else if (ChosenCar == 4) {
                System.out.println("You Chosed " + c4.toString());
                writer.write("You Chosed " + c4.toString());
            } else if (ChosenCar == 5) {
                System.out.println("You Chosed " + c5.toString());
                writer.write("You Chosed " + c5.toString());
            } else if (ChosenCar == 6) {
                System.out.println("You Chosed " + c6.toString());
                writer.write("You Chosed " + c6.toString());
            } else {
                System.exit(0);
                System.out.print("You Enter invalid Choice! ");
                writer.write("You Enter invalid Choice! ");
            }
            writer.newLine();
            writer.write("---------------------------------------------------------------------------------");
            writer.newLine();
            System.out.print("What is Your First Name: ");
            String fname = reader.next();
            System.out.print("What is Your Last Name: ");
            String lname = reader.next();
            System.out.print("What is Your Phone Number: ");
            int PhoneNumber = reader.nextInt();
            System.out.print("What is Your SSN: ");
            long SSN = reader.nextLong();
            System.out.print("What is Your Address: ");
            String address = reader.next();
            System.out.print("What is Your Credit Card Number: ");
            long creditCard = reader.nextLong();
            Customer cust = new Customer(fname, lname, PhoneNumber, SSN, address, creditCard);
            writer.write("Your data is: ");
            writer.newLine();
            writer.write(cust.toString());
            System.out.println("Your data is: ");
            System.out.println(cust.toString());
            Employee e1 = new Employee();
            e1.setFname("Ahmed");
            e1.setLname("Hassan");
            e1.setSSN(829183923);
            e1.setPhoneNumber(01030203400);
            e1.setAddress("Cairo Egypt");
            writer.newLine();
            writer.write("---------------------------------------------------------------------------------");
            writer.newLine();
            System.out.println("Data of Employee You Rent With him: \n" + e1.toString());
            writer.newLine();
            writer.write("Data of Employee You Rent With him: ");
            writer.newLine();
            writer.write(e1.toString());
            Date d = new Date();
            writer.write(d.toString());

        }
    }
}
