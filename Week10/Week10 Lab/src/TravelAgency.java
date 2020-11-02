import java.util.Arrays;

public class TravelAgency {
    //Lab 4
    //Instance variables
    private String agencyName;
    private String agencyAddress;
    private String[] destinations;
    private Booking[] reservations;

    //Constructors
    public TravelAgency (String agencyName, String agencyAddress, String[] destinations) {
        setAgencyName(agencyName);
        setAgencyAddress(agencyAddress);
        setDestinations(destinations);
        reservations = new Booking[]{};
    }

    //Accessors
    public String getAgencyName () {return agencyName; }

    public String getAgencyAddress () {return agencyAddress; }

    public String[] getDestinations () {return destinations; }

    public Booking[] getReservations () {return reservations; }

    //Mutators
    public boolean setAgencyName(String newAgencyName) {
        if (newAgencyName.length() >= 5) {
            agencyName = newAgencyName;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean setAgencyAddress(String newAgencyAddress) {
        if (newAgencyAddress.length() >= 9) {
            agencyAddress = newAgencyAddress;
            return true;
        } else {
            return false;
        }
    }

    public boolean setDestinations(String[] newDestinations) {
        destinations = newDestinations;
        return true;
    }

    public boolean setReservations(Booking[] newReservations) {
        reservations = newReservations;
        return true;
    }

    //Other Methods
    public String toString() {
        String outString = "";

        outString += "Agency name: " + agencyName + " / ";
        outString += "Agency address: " + agencyAddress + " / ";
        outString += "Destinations: " + Arrays.toString(destinations) + " / ";
        outString += "Reservations: " + Arrays.toString(reservations);

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
        for (String destination : destinations) {
            if (included.equals(destination)) {
                return true;
            }
        }
            return false;
        }
    //

    public boolean addReservation(Booking newReservation) {
        return isBookingValid(newReservation);
        //reservations[????]=(newReservation);
    }

    public double getTotalIncome() {
        double sum = 0;
        int passengers = 0; //number of passengers
        double cost = 0; //cost per passenger
        for (Booking booking:reservations) {

            sum += (reservations[1].noPassengers * reservations[2].costPerPassenger);
        }
        return sum;
    }

    //Lab 6
    public void printBookings(int input){
        Booking[] index = reservations;
        for(int i = 0; i < input; i++){
            for(int j = i + 1; j < input; j++){
                if((index[i].noPassengers * index[i].costPerPassenger) < (index[j].noPassengers * index[j].costPerPassenger)){
                    Booking temp = index[i];
                    index[i] = index[j];
                    index[j] = temp;
                }
            }
        }
        for(int i = 0; i < input; i++){
            System.out.println(index[i].destination+"|"+index[i].noPassengers+"|"+index[i].costPerPassenger);
        }
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
