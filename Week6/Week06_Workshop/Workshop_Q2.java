package Week6;

public class Workshop_Q2 {
    public static void main(String[] args) {
        String day = "Monday";
        if (day.equalsIgnoreCase("Monday")) {
            System.out.println("Start of Work Week");
        }
            else
                if (day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Thursday")) {
                    System.out.println("Midweek");
                }
                else
                    if (day.equalsIgnoreCase("Friday")) {
                        System.out.println("End of Work Week");
                    }
                        else
                            if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
                                System.out.println("Weekend");
                            }
                            else {
                                System.out.println("Invalid Day");
                            }
                    }
        }
