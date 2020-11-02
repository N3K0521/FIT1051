import java.util.ArrayList;
import java.util.List;

public class TravelAgencyWithCarRental extends TravelAgency {
    //Lab 1b
    //instance variable
    ArrayList<Car> fleet;

    //constructor
    public TravelAgencyWithCarRental(String agencyName, String agencyAddress, String[] destinations) {
        super(agencyName, agencyAddress, destinations);
        fleet = new ArrayList<Car>();
    }

    //Lab 2
    //method addCar
    public void addCar(String maker, int numberOfSeats, double costPerDay) {
        Car newCar = new Car(maker, numberOfSeats, costPerDay);
        fleet.add(newCar);
    }

    //Lab 3
    //method bookCar
    public Car bookCar(String maker, int numberOfSeats, int numberOfDays) {
        for (Car bookedCar : fleet) {
            if (bookedCar.getMaker().equals(maker) && !bookedCar.isTaken() && bookedCar.getNumberOfSeats() >= numberOfSeats) {
                bookedCar.setIsTaken(true);
                bookedCar.setNumberOfDays(numberOfDays);
            } else {
                bookedCar.setIsTaken(false);
            }
            return bookedCar;
        }
        return null;
    }

    //Lab 4
    //method returnCar
    public void returnCar(String maker, Integer numberOfSeats) {
        for (Car returnedCar : fleet) {
            if (returnedCar.getMaker().equals(maker) && returnedCar.isTaken() && returnedCar.getNumberOfSeats() == numberOfSeats) {
                returnedCar.setIsTaken(false);
            }
            else{
                returnedCar.setIsTaken(true);
            }
        }
    }

    //Lab 5
    //Override method getTotalIncome
    public double getTotalIncome() {
        double totalIncome = super.getTotalIncome();
        double currentIncome = 0.0;
        for (Car car : fleet) {
            if (car.isTaken())
                currentIncome += car.getNumberOfDays() * car.getCostPerDay();
        }
        return totalIncome + currentIncome;
    }
}
