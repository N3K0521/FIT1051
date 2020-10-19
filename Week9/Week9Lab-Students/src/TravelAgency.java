import java.util.ArrayList;
import java.util.Arrays;

public class TravelAgency {
    //Lab 1
    //Instance variables
    private String agencyName;
    private String agencyAddress;
    private String[] destinations;
    private ArrayList<String> reservations;

    //Lab 3
    //Constructors
    public TravelAgency (String agencyName, String agencyAddress, String[] destinations) {
        setAgencyName("");
        setAgencyAddress("");
        setDestinations(destinations);
        setReservations(new ArrayList<>());
    }

    //Lab 2
    //Accessors
    public String getAgencyName () {return agencyName; }

    public String getAgencyAddress () {return agencyAddress; }

    public String[] getDestinations () {return destinations; }

    public ArrayList<String> getReservations () {return reservations; }

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
        boolean flag2 = true;
        if (newAgencyAddress.length() >= 9 ) {
            agencyAddress = newAgencyAddress;
        }
        else {
            flag2 = false;
        }
        return flag2;
    }

    public void setDestinations(String[] newDestinations) {
        destinations = newDestinations;
    }

    public void setReservations(ArrayList<String> newReservations) {
        reservations = newReservations;
    }

    //Other Methods
    //Lab 4
    public String toString() {
        String retVal = "";

        retVal += "Agency name: " + agencyName + " / ";
        retVal += "Agency address: " + agencyAddress + " / ";
        retVal += "Destinaitons: " + Arrays.toString(destinations) + " / ";
        retVal += "Reservations: " + reservations;

        return retVal;
    }

    //Lab 5
    public boolean isBookingValid(String booking) {

        boolean result = true;
        try {
            String[] bookingString = booking.split(";");

            if(bookingString == null || bookingString.length < 3 || bookingString.length > 3) {
                result = false;
            }
            String destination = bookingString[0];
            if(destination != null && destination.equals("")) {
                result = false;
            }
            boolean destinationFound = false;
            for (int i = 0; i < destinations.length; i++) {
                if(destination.equals(destinations[i])) {
                    destinationFound = true;
                    break;
                }
            }
            if(!destinationFound) {
                result = false;
            }
            //checking if no of persons is numeric
            Integer.parseInt(bookingString[1]);
            //checking if cost is numeric
            Double.parseDouble(bookingString[2]);

        } catch (NumberFormatException e) {
            result = false;
        }
        return result;
    }

    //Lab 6
    public boolean addReservation(String booking) {
        if(isBookingValid(booking)) {
            reservations.add(booking);
            return true;
        } else {
            return false;
        }

    }
    //Lab 7
    public double getTotalIncome() {
        int sum = 0;
        int passengers = 0; //number of passengers
        int cost = 0; //cost per passenger
        for (String booking:reservations) {
            String[] bookingList = booking.split(";");
            sum += (Integer.parseInt(bookingList[1]) * Double.parseDouble(bookingList[2]));
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
