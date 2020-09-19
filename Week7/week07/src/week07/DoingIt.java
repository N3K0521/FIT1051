package week07.src.week07;

/**
 * Created by shuxford on 25/12/2015.
 */
public class DoingIt {
    Window myWindow;

    //class level variables here

    public void doIt(Window win){
        myWindow = win;

        //whileForPaste01();
        //whileForPaste02();
        //whileForPaste03();
        //whileForPaste04();

        //forForPaste01();
        //enhancedForForPaste01();
        //videoWhileLoopInfiniteLoop01();

        //lab1();
        //lab2();
        //lab3();
        //lab4();
        //lab5();
        lab6();
    }

    //LAB EXERCISES for you to code ===========================================

    private void lab1(){
        //initialize the variables
        int dice1, dice2;
        int count = 1;

        //generate one roll for each dice (random integer selected from 1 to 6)
        myWindow.clearOut();
        dice1 = getRandom(1, 6);
        dice2 = getRandom(1, 6);
        myWindow.writeOutLine("dice1: "+dice1+" | "+"dice2: "+dice2);

        //while the faces are different, do...
        while (dice1 != dice2) {
            count ++;
            dice1 = getRandom(1, 6);
            dice2 = getRandom(1, 6);
            myWindow.writeOutLine("dice1: "+dice1+" | "+"dice2: "+dice2);
        }

        //print the count
        myWindow.writeOutLine("Count: "+count);
    }

    private void lab2() {
        int total_times = 10;
        int sum = 0;

        while (total_times > 0) {
            total_times--;
            int dice1, dice2;
            int count = 1;

            myWindow.clearOut();
            dice1 = getRandom(1, 6);
            dice2 = getRandom(1, 6);
            myWindow.writeOutLine("dice1: "+dice1+" | "+"dice2: "+dice2);

            while (dice1 != dice2) {
                count++;
                dice1 = getRandom(1, 6);
                dice2 = getRandom(1, 6);
                myWindow.writeOutLine("dice1: " + dice1 + " | " + "dice2: " + dice2);
            }
            sum = sum + count;
        }

        double avg = sum/10.0;

        myWindow.writeOutLine("Average: "+avg);
    }

    private void lab3() {
        //value controlled -> the number of repetition is unknown
        String[] ar = {"4", "5", "8", "10", "9", "-2", "8"};
        String value = "8";
        int i=0;

        while (i<ar.length && !ar[i].equals(value))
            i++;

        myWindow.clearOut();
        if(i==ar.length)
            myWindow.writeOutLine("Not found");
        else
            myWindow.writeOutLine("Index: "+i);
    }

    private void lab4() {
        //initializing variables
        int num, sum = 0, even_num = 0;
        double average;

        //iterating until 100 even numbers are generated
        myWindow.clearOut();
        do {
            num = getRandom(0, 1000);
            //Random rand = new Random(1000)
            //num = rand.nextInt(1000)
            myWindow.writeOutLine(num);
            if (num % 2 == 0) { //if num is even -> add to the sum
                sum += num;
                even_num++;
            }
        } while (even_num < 100) ;
        myWindow.writeOutLine("Average: " + sum / even_num);
    }

    private void lab5(){
        int i = 0;
        int count = 0;
        String[] ar={"David","Sally","Ellen","Adam","Sally"};
        String value ="Sally";

        for (i=0; i < ar.length; i++) {
            if(ar[i].equals(value)) {
                count ++;
            }
        }

        myWindow.clearOut();
        if (count > 1) {
            myWindow.writeOutLine("for value= "+value+", the output = "+count+", True");
        }
            else {
                myWindow.writeOutLine("for value= "+value+", the output = "+count+", False");
            }
    }


    private void lab6(){
        int[] ar = {1, 6, 30, 4, 36, 29, 36};
        int i;
        int highest = ar[0];
        int second = ar[1];
        for (i = 0; i < ar.length; i++) {
            //If current element is smaller than highest then update both highest and second
            if (ar[i] > highest) {
                second = highest;
                highest = ar[i];
            }
            // If arr[i] is in between highest and second then update second
            else
                if (ar[i] > second && ar[i] != highest) {
                second = ar[i];
            }
        }

        myWindow.clearOut();
        myWindow.writeOutLine("The second highest value is: " + second);
    }




    //WORKSHOP CODE for you to play with ======================================
    private void whileForPaste01(){
        int count = 0, total = 0;

        while (total < 1000){
            total += getRandom(1, 6); //see utility methods below
            count++;
        }

        myWindow.clearOut();
        myWindow.writeOutLine("Count: " + count);
    }

    private void whileForPaste02(){
        int counter;
        int limit = 100;
        final int SENTINEL = -1 + (int) (Math.random() * 12); //[-1 .. 10]
        int  value = 0;
        boolean condition = false;

        //use a for loop for best style
        counter = 0; // or 1 depending on statements in loop block
        while (counter <= limit){ //or < or >= or > (== and != are risky, they could be skipped over)

            //process

            counter++; //or some other incrementing/decrementing
        }

        //get initial value from source
        while(value != SENTINEL){ //!value.equals(SENTINEL) for Strings

            //process input

            //get next value from source
        }

        //perform potential condition changing calculations with initial values
        while (condition){

            //process

            //perform potential condition changing calculations with updated values
        }
    }

    private void whileForPaste03(){
        final int SENTINEL = -1;
        int input = -1 + (int) (Math.random() * 12);
        myWindow.clearOut();

        while (input != SENTINEL)
            myWindow.writeOutLine(input);
            input = -1 + (int) (Math.random() * 12);

        while (input != SENTINEL)
            myWindow.writeOutLine(input);
        input = -1 + (int) (Math.random() * 12);

        while (input != SENTINEL) {
            myWindow.writeOutLine(input);
            input = -1 + (int) (Math.random() * 12);
        };

        while (input != SENTINEL); {
            myWindow.writeOutLine(input);
            input = -1 + (int) (Math.random() * 12);
        }
    }

    private void whileForPaste04(){
        int[] someArray = {1, 2, 3, 4, 5};
        int i;

        i = 0;
        while (i < someArray.length){   // takes care of an empty array
                                        //but not a null array
            // process the ith element using someArray[i] to access its value

            i++;
        }
    }


    private void forForPaste01(){
        final int MULTIPLIER = 7;
        int result;

        myWindow.clearOut();
        for (int i = 10; i >= 1; i--){
            result = i * MULTIPLIER;
            myWindow.writeOutLine("7 X " + i + " = " + result);
        }
    }

    private void enhancedForForPaste01(){
        int [] bigScreenTVMonthlyUnitsSold = {435, 151, 120, 134, 199, 201, 312, 147, 107, 127, 115, 258};
        int monthCount = 0;

        for (int elem : bigScreenTVMonthlyUnitsSold){
            if (elem >= 200)
                monthCount++;

        }

        myWindow.clearOut();
        myWindow.writeOutLine("Number of months: " + monthCount);
    }

    private void videoWhileLoopInfiniteLoop01(){

        int i = 1;

        while (i != 10){
            //process

            i = i + 2;
        }

    }


    //==========================================================================
    // UTILITIES ===============================================================
    //==========================================================================
    private static boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    private static int getRandom(int n1, int n2){
        int retVal = 0;

        retVal = n1 + (int) Math.floor(Math.random() * (n2 - n1 + 1));

        return retVal;
    }

}
