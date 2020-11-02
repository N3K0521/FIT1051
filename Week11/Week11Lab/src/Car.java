public class Car {
    //Lab 1a
    //instance variables
    private String maker;
    private int numberOfSeats;
    private double costPerDay;
    private int numberOfDays;
    private boolean isTaken;


    //Constructor
    public Car(String maker, int numberOfSeats, double costPerDay) {
        setMaker(maker);
        setNumberOfSeats(numberOfSeats);
        setCostPerDay(costPerDay);
        numberOfDays=0;
        isTaken=false;
    }

    //Accessors
    public String getMaker() {
        return maker;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public boolean isTaken() {
        return isTaken;
    }



    //Mutators
    public boolean setMaker(String newMaker){
        boolean flag = true;
        if (newMaker.length() >= 3){
            maker = newMaker;
        }
        else {
            flag = false;
        }
        return flag;
    }

    public boolean setNumberOfSeats(int newNumberOfSeats) {
        boolean valid = true;
        if (newNumberOfSeats >= 2 && newNumberOfSeats <= 12){
            numberOfSeats = newNumberOfSeats;
        }
        else{
            valid = false;
        }
        return valid;
    }

    public boolean setCostPerDay(double newCostPerDay) {
        boolean fine = true;
        if (newCostPerDay >= 0.0){
            costPerDay = newCostPerDay;
        }
        else{
            fine = false;
        }
        return fine;
    }

    public boolean setNumberOfDays(int newNumberOfDays) {
        boolean okay = true;
        if (numberOfDays >= 1 && numberOfDays <= 30){
            numberOfDays = newNumberOfDays;
        }
        else{
            okay = false;
        }
        return okay;
    }

    public boolean setIsTaken(boolean newIsTaken){
        boolean right = false;
        if (isTaken = newIsTaken) {
            isTaken = newIsTaken;
        }
        else{
            right = true;
        }
        return right;

    }


    //Other methods
    //toString

    @Override
    public String toString() {
        return "Car{" +
                "maker='" + maker + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", costPerDay=" + costPerDay +
                ", numberOfDays=" + numberOfDays +
                ", isTaken=" + isTaken +
                '}';
    }
}