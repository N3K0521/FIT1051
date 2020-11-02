public class Booking {
    //Lab 1
    //Instance variables
    String destination;
    int noPassengers;
    double costPerPassenger;

    //Lab 2
    //Constructors
    public Booking (String destination, int noPassengers, double costPerPassenger) {
        setDestination(destination);
        setNoPassengers(noPassengers);
        setCostPerPassenger(costPerPassenger);
    }

    //Accessors
    public String getDestination () {return destination; }

    public int getNoPassengers () {return noPassengers; }

    public double getCostPerPassenger () {return costPerPassenger; }

    //Mutators
    public boolean setDestination (String newDestination) {
        boolean flag = true;
        if (newDestination.length() >= 5) {
            destination = newDestination;
        }
        else {
            flag = false;
        }
        return flag;
    }

    public boolean setNoPassengers (int newNoPassengers) {
        boolean valid = true;
        if (newNoPassengers <= 50 && newNoPassengers >= 1) {
            noPassengers = newNoPassengers;
        }
        else {
            valid = false;
        }
        return valid;
    }

    public boolean setCostPerPassenger (double newCostPerPassenger) {
        boolean fine = true;
        if (newCostPerPassenger >= 0.0) {
            costPerPassenger = newCostPerPassenger;
        }
        else {
            fine = false;
        }
        return fine;
    }

    //Lab 3
    //Other methods
    public String toString () {
        String outString = "";

        outString += "Destination: " + destination + " / ";
        outString += "Number of Passenger: " + noPassengers + " / ";
        outString += "Cost per passenger: " + costPerPassenger;

        return outString;
    }

}