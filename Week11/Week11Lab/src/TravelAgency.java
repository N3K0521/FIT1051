import java.util.ArrayList;
import java.util.Arrays;

public class TravelAgency {
    //Lab 4
    //Instance variables
    private String agencyName;
    private String agencyAddress;
    private String[] destinations;
    private ArrayList<Booking> reservations;

    //Constructors
    public TravelAgency (String agencyName, String agencyAddress, String[] destinations) {
        setAgencyName(agencyName);
        setAgencyAddress(agencyAddress);
        setDestinations(destinations);
        setReservations(new ArrayList<Booking>());
    }

    //Accessors
    public String getAgencyName () {return agencyName; }

    public String getAgencyAddress () {return agencyAddress; }

    public String[] getDestinations () {return destinations; }

    public ArrayList<Booking> getReservations () {return reservations; }

    //Mutators

    public boolean setAgencyName(String newAgencyName) {
        boolean flag = true;
        if (newAgencyName.length() >= 5) {
            agencyName = newAgencyName;
        }
        else {
            flag = false;
        }
        return flag;
    }

    public boolean setAgencyAddress(String newAgencyAddress) {
        boolean yes = true;
        if (newAgencyAddress.length() >= 9) {
            agencyAddress = newAgencyAddress;
        } else {
            yes = false;
        }
        return yes;
    }

    public boolean setDestinations(String[] newDestinations) {
        destinations = newDestinations;
        return true;
    }

    public boolean setReservations(ArrayList<Booking> newReservations) {
        reservations = newReservations;
        return true;
    }

    //Other Methods
    public String toString() {
        String outString = "";

        outString += "Agency name: " + agencyName + " / ";
        outString += "Agency address: " + agencyAddress + " / ";
        outString += "Destinations: " + Arrays.toString(destinations) + " / ";
        outString += "Reservations: " + Arrays.toString(new ArrayList[]{reservations});

        return outString;
    }

    public boolean isBookingValid(Booking valid) {
        if (valid.setDestination(valid.destination)
                && isDestination(valid.destination)) {
            return valid.setNoPassengers(valid.noPassengers)
                    && valid.setCostPerPassenger(valid.costPerPassenger);
        }
        return false;
    }

    //helper method
    private boolean isDestination (String included) {
        for (int i =0; i < destinations.length; i++) {
            if (included.equals(destinations[i])) {
                return true;
            }
        }
        return false;
    }
    //

    public boolean addReservation(Booking newReservation) {
        boolean valid = true;
        if(isBookingValid(newReservation)){
            reservations.add(newReservation);
        }
        else{
            valid = false;
        }
        return valid;
    }

    public double getTotalIncome() {
        double sum = 0;
        for (int i= 0; i < reservations.size(); i++) {
            sum += (reservations.get(i).noPassengers * reservations.get(i).costPerPassenger);
        }
        return sum;
    }



    /**
     * this method returns true if the input string is numeric;false otherwise
     * @param str
     * @return
     */
    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
}
