package week08.src.week08;

/**
 * Created by shuxford on 25/12/2015.
 */
public class DoingIt {
    Window myWindow;

    //IMPORTANT - Window class refactored to instantiate 1 DoingIt object for all Do It button clicks
    //IMPORTANT - not instantiating 1 DoingIt object per Do It button click
    //IMPORTANT - This allows the class level variable "step" to persist between Do It button clicks

    int step = 1; //for method hierarchy example
    int goodCounter = 0; //for countExecutions example


    public void doIt(Window win){
        myWindow = win;

        //caller();
        //AnotherCaller();
        //orchestratingMethod();

        //Lab1();
        //Lab2();
        //Lab3();
        //Lab4();

    }

    //LAB EXERCISES for you to code ============================================

    /* ------------------------------- Lab 1 --------------------------------------*/
    private String daySuffix(String num) {
        int intNum = 0;
        String result = "";
        if (num == null) {
            result = null;
        }
        else {
            if (isNumeric(num)) {
                if (Double.parseDouble(num) == (int) Double.parseDouble(num)) {
                    intNum = (int)Double.parseDouble(num);
                }
                else {
                    intNum = (int)Math.round(Double.parseDouble(num));
                }
            }
            else {
                result = null;
            }
        }
        //       Check if the integer is in the range 1 to 31 inclusive
        if (intNum >= 1 && intNum <= 31) {
            if (intNum % 10 == 1) {
                result = num + "st";
            } else if (intNum % 10 == 2) {
                result = num + "nd";
            } else if (intNum % 10 == 3) {
                result = num + "rd";
            } else {
                result = num + "th";
            }
        }
        else {
            result = null;
        }
    return result;
}
    //Test cases
    private void Lab1(){
        myWindow.clearOut();
        for(int day = 1; day <= 31; day++){
            myWindow.writeOutLine(daySuffix(day+""));
        }
    }

    /* ------------------------------- Lab 2 --------------------------------------*/
    private double calcSeries(int x, int n){
        double y=1;//when x=0, n=0, y=1
        double sum=0;
        for(int i = 1; i <= n; i++){ //sum n terms of i starting from i=1
            sum = sum + (double)(i*i) / (i*x);
        }

        y=y+sum; //y=1+(i^2)/(i*x)

        return y;
    }
    //Test case
    private void Lab2(){
        myWindow.clearOut();
        myWindow.writeOutLine(calcSeries(8, 4));
    }

    /* ------------------------------- Lab 3 --------------------------------------*/
    private int[] sumPrevious(int[] ar) {
        int[] sumArray = new int[0];
        sumArray = new int[ar.length];
        sumArray[0] = ar[0];//when sumArray.length = ar.length = 0
        for (int i = 1; i < ar.length; i++) {
            for (int j = 0; j <= i; j++) {
                sumArray[i] = sumArray[i] + ar[j];
            }
        }
        return sumArray;
    }

    //Test case
    private void Lab3() {
        myWindow.clearOut();
        int[] ar = {1,2,3,4,5};
        myWindow.writeOutLine(sumPrevious(ar));
    }


    /* ------------------------------- Lab 4 --------------------------------------*/
    private int backwardNumber(int num) {
        int rev_num = 0;
        while(num > 0) {
            int digit = num % 10;
            num = num / 10;
            if (digit % 2 == 0) {
                rev_num = rev_num * 10 + digit;
            }
        }
        return rev_num;
    }

    //Test Case
    private void Lab4(){
        myWindow.clearOut();
        myWindow.writeOutLine(backwardNumber(1234567));
    }


    //WORKSHOP CODE for you to play with =======================================
    private void caller(){
        double number1 = 7.0;

        myWindow.clearOut();
        myWindow.writeOutLine("Before call to calledNoReturn()");
        calledNoReturn(number1 + 10.0, Math.pow(number1, 2));
        myWindow.writeOutLine("After call to calledNoReturn()");
    }

    private void calledNoReturn(double n1, double n2){
        double sum = 0;
        sum = n1 + n2;
        myWindow.writeOutLine("calledNoReturn begins executing");
        myWindow.writeOutLine("sum of formal parameters is: " + sum);
        myWindow.writeOutLine("calledNoReturn finishes executing");
    }

    private void AnotherCaller(){
        double number1 = 7.0;

        myWindow.clearOut();
        myWindow.writeOutLine("Before call to calledReturn()");
        myWindow.writeOutLine(100.0 + calledReturn(number1 + 10.0, Math.pow(number1, 2)));
        myWindow.writeOutLine("After call to calledReturn()");
    }

    private double calledReturn(double n1, double n2){
        double sum = 0;
        sum = n1 + n2;
        myWindow.writeOutLine("calledReturn begins executing");
        myWindow.writeOutLine("about to execute return statement");
        return sum;
        //myWindow.writeOutLine("calledReturn finishes executing"); unreachable statement
    }


    //==========================================================================
    //METHOD HIERARCHY - EXAMPLE
    private void orchestratingMethod(){ //no display dependency
        String instructions = "";
        instructions += "Enter a comma separated list like: \n";
        instructions += "start table, end table, start range, end range, multiplication symbol.\n";
        instructions += "Then click the Do It! button again.";


        if (step == 1) { //step is class level
            prompt(instructions);
            step = 2;
        }
        else if (step == 2) {
            displayOutput(process(getInput())); //call sequence 1. getInput 2. process 3. displayOutput
            step = -1; //end step sequence
        }
        else{
            //do nothing, step sequence has finished
        }
    }

    private void prompt(String promptToDisplay){
        myWindow.clearOut();
        myWindow.clearIn();

        myWindow.writeOutLine(promptToDisplay);
    }

    private String[] getInput(){
        return myWindow.readIn().split("\\s*,\\s*"); //splits into tokens
    }

    private String process(String[] splitInput){ //no display dependency
        int startTable, stopTable, from, to;
        String symbol;
        String result = "";

        //exception handling should start here
        startTable = Integer.parseInt(splitInput[0]);
        stopTable = Integer.parseInt(splitInput[1]);
        from = Integer.parseInt(splitInput[2]);
        to = Integer.parseInt(splitInput[3]);
        //exception handling should stop here

        symbol = splitInput[4];


        for (int i = startTable; i <= stopTable; i++){
            result += ">>>" + i + " times table\n";
            result += timesTable(i, from, to, symbol) + "\n";
        }

        return result;
    }

    private void displayOutput(String toDisplay){
        myWindow.clearOut();
        myWindow.writeOutLine(toDisplay);
    }

    private String timesTable(int tableNumber, int from, int to, String timesSymbol){
        String table = "";

        for (int i = from; i <= to; i++){
            table += String.format("%3d %s %3d = %3d\n", i, timesSymbol, tableNumber, i * tableNumber);
        }

        return table;
    }
    //==========================================================================


    // =========================================================================
    // UTILITIES ===============================================================
    // =========================================================================
    private boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

}
