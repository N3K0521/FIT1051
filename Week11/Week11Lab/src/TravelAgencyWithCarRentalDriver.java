import java.util.Scanner;

public class TravelAgencyWithCarRentalDriver {

    public static void main(String[] args) {
        boolean isSuccess = false;
        Booking booking;
        double totalIncome;
        //List of destinations
        String[] destinations = {"Sydney", "Beijing", "New Delhi", "London"};

        // Create a new instance of TravelAgency Class using the 3-parameter constructor
        TravelAgencyWithCarRental travelAgency = new TravelAgencyWithCarRental("Oz", "Melbourne", destinations);
        travelAgency.addCar("BMW",5,150);
        travelAgency.addCar("Toyota",5,70);
        travelAgency.addCar("Audi",5,200);
        travelAgency.addCar("BMW",7,190);
        travelAgency.addCar("BMW",12,350);


        booking=new Booking("New Delhi",6,16);
        isSuccess= travelAgency.addReservation(booking);
        booking=new Booking("Sydney",3,50);
        isSuccess= travelAgency.addReservation(booking);

        Car bookedCar;
        bookedCar=travelAgency.bookCar("BMW",6,4);
        System.out.println(bookedCar);
        bookedCar=travelAgency.bookCar("BMW",6,6);
        System.out.println(bookedCar);
        travelAgency.returnCar("BMW",bookedCar.getNumberOfSeats());
        bookedCar=travelAgency.bookCar("BMW",3,4);
        System.out.println(bookedCar);
        bookedCar=travelAgency.bookCar("Mazda",3,4);
        System.out.println(bookedCar);
        totalIncome=travelAgency.getTotalIncome();
        System.out.println("Travel Agency "+travelAgency.getAgencyName()+" has total income=$"+totalIncome);
    }
}
