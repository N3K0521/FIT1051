package Week4.week04.src.week04;

/**
 * Created by shuxford
 */
public class DoingIt {
    Window myWindow;

    public void doIt(Window win){
        myWindow = win;

//        lab1();
//        lab2();
//        lab3();
//        lab4();
//        lab5();
//        lab6();
        lab7();
//        lab8();

//        assignmentIsAnOperator();
//        arithmeticOperations();
//        equalityRelationalOperators();
//        equalityRelationalOperators2();
//        logicalOperators();
//        redundantSyntax();
//        blockScopeTest();
    }

    //LAB EXERCISES for you to code
    private void lab1(){
        // The following expression will be true for odd num
        int n;
        boolean isOdd;

        // All test cases
        n = 15; // positive odd number -> true
        isOdd = n % 2 == 1;
/*
        n = 10; // positive even number -> false
        isOdd = n % 2 == 1;

        n = -100; // negative even number -> false
        isOdd == n % 2 == 1;

        n = -171; // negative odd number -> true
        isOdd == n % 2 == 1;

        n = 0; // zero -> false
        isOdd == n % 2 == 1;
*/
        myWindow.clearOut();
        myWindow.writeOutLine(isOdd);
    }

    private void lab2(){
        // The following expression will be true for positive even number
        int n;
        boolean isPosEven;

        // All test cases
        n = 10; // positive even number -> true
        isPosEven = n % 2 != 1 && n > 0;
/*
        n = 15; // positive odd number -> false
        isPosEven = n % 2 != 1 && n > 0;

        n = -100; // negative even number -> false
        isPosEven = n % 2 != 1 && n > 0;

        n = -171; // negative odd number -> false
        isPosEven = n % 2 != 1 && n > 0;

        n = 0; // zero -> false
        isPosEven = n % 2 != 1 && n > 0;
*/
        myWindow.clearOut();
        myWindow.writeOutLine(isPosEven);
    }

    private void lab3(){
        // The following expression will be true for n in range -10 to 200 inclusive
        // but not an odd in the range 60 to 80 inclusive
        int n;
        boolean isTrue;

        // All test cases
        n = 10; // positive; in range -10 to 200; not an odd in the range 60 to 80 -> true
        isTrue = (n >= -10 && n <= 200) && !(n % 2 == 1 && n >= 60 && n <= 80);
/*
        n = -9; // negative; in range -10 to 200; not an odd in the range 60 to 80 -> true
        isTrue = (n >= -10 && n <= 200) && !(n % 2 == 1 && n >= 60 && n <= 80);

        n = 201; // positive; not in range -10 to 200; not an odd in the range 60 to 80  -> false
        isTrue = (n >= -10 && n <= 200) && !(n % 2 == 1 && n >= 60 && n <= 80);

        n = -20; // negative; not in range -10 to 200; not an odd in the range 60 to 80 -> false
        isTrue = (n >= -10 && n <= 200) && !(n % 2 == 1 && n >= 60 && n <= 80);

        n = 61; // positive; in range -10 to 200; an odd in the range 60 to 80 -> false
        isTrue = (n >= -10 && n <= 200) && !(n % 2 == 1 && n >= 60 && n <= 80);

        n = 62; // positive; in range -10 to 200; an even in the range 60 to 80 -> true
        isTrue = (n >= -10 && n <= 200) && !(n % 2 == 1 && n >= 60 && n <= 80);

        n = 0; // zero -> true
        isTrue = (n >= -10 && n <= 200) && !(n % 2 == 1 && n >= 60 && n <= 80);
*/
        myWindow.clearOut();
        myWindow.writeOutLine(isTrue);
    }

    private void lab4(){
        String userInput = myWindow.readIn();
        //to testify whether userInput contains "FIT" or "2098" or "Week" (has any one of will return true)
        boolean isTrue = userInput.contains("FIT")|userInput.contains("2095")|userInput.contains("Week");

        //Test cases
/*
        //Input doesn't contain any one of them
        userInput: "Hello world."
        output: false

        //Input contains one term
        userInput: "This week is Week 4."
        output: true

        //Input contains one term but in lowercase
        userInput: "I had a nice week."
        output: false

        //Input contains more than one term
        userInput: "Welcome to FIT2095!"
        output: true
*/
        myWindow.clearOut();
        myWindow.writeOutLine(isTrue);
    }

    private void lab5(){
        //Return false if a String variable "userInput" doesn't have the value "FIT2095"
        String userInput = myWindow.readIn();
        String value = new String("FIT2095");
        boolean isFalse= userInput.contains("FIT2095") & userInput.equals(value);
        // ==(equality/inequality operators only compare whether the two variables are stored
        // at the same location in memory, which is one value being referenced by two variables;
        // However, in this case, the question asks for determining whether userInput has the
        // value of "FIT2095" or not.

        //Test cases
/*
        //Input doesn't contain "FIT2095"
        userInput: "Hi."
        output: false

        //Input contains "fit2095" where the value is not equal to "FIT2095"
        userInput: ""FIT2095""
        output: false

*/
        myWindow.clearOut();
        myWindow.writeOutLine(isFalse);
    }

    private void lab6(){
        //leap year: divisible by 4 and not divisible by 100 OR divisible by 400
        int year = 2000; // true
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        // All test cases
/*
        year = 1000; // divisible by 4 and divisible by 100 AND not divisible by 400 -> false
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        year = 2400; // divisible by 4 and divisible by 100 AND divisible by 400 -> true
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
*/
        myWindow.clearOut();
        myWindow.writeOutLine(isLeapYear);
    }

    private void lab7(){
        //initial values
        int variable1 = 1;
        int variable2 = 2;
        int temp = 0; //for storing the value of one variable
        //right <- left
        temp = variable1; //assign the value of variable1 to temp
        variable1 = variable2; //assign the value of variable2 to variable1
        variable2 = temp; //assign the value of temp (which initially is variable1's) to variable2
        System.out.println("variable1 = " + variable1);
        System.out.println("variable2 = " + variable2);
    }

    private void lab8(){
        double a = 1.0;
        double b = 3.0;
        double c = 2.0;
        //assuming that b*b - 4.0*a*c are greater or equal to zero
        double discriminants;
        discriminants = (b * b) - (4.0 * a * c);
        double root1 = (-b + Math.pow(discriminants, 0.5)) / (2.0*a);
        double root2 = (-b - Math.pow(discriminants, 0.5)) / (2.0*a);
        System.out.println("The two roots of this equation are (x" + root1 + ")" + " and (x"+ root2 + ")");
    }



    //WORKSHOP CODE for you to play with
    private void assignmentIsAnOperator(){
        int testInt;
        myWindow.clearOut();
        myWindow.writeOutLine(testInt = 123);
    }

    private void arithmeticOperations(){
        //using literals to keep things clear but could have used variables
        int i1, i2, i3; //these are reused multiple times for multiple uses in this method which is poor style in real code

        myWindow.clearOut();

        myWindow.writeOutLine(1.0 / 2.0);
        myWindow.writeOutLine(1 / 2);
        myWindow.writeOutLine((double) 1 / 2);

        myWindow.writeOutLine(7 % 3);
        myWindow.writeOutLine(7 % 8);

//        int counter = 0;
//        counter = counter + 1;
//        ++counter; //pre increment
//        counter++; //post increment
//
//        counter = counter - 1;
//        --counter; //pre decrement
//        counter--; //post decrement

        myWindow.writeOutLine("");
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + ++i2);
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + i2++);
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + --i2);
        i1 = 1; i2 = 2;
        myWindow.writeOutLine(i1 + i2--);

        double totalSales = 0, thisSale;
        thisSale = 5.50;
        totalSales += thisSale;
        myWindow.writeOutLine(totalSales);
        thisSale = 7.50;
        totalSales += thisSale;
        myWindow.writeOutLine(totalSales);

//        totalSales = totalSales + thisSale;
//        totalSales += thisSale;

        myWindow.writeOutLine("");
        double pi = Math.PI;                        //no parenthesis after PI ???
        myWindow.writeOutLine(Math.floor(pi));
        myWindow.writeOutLine(Math.pow(2.0, 20));   //1MByte
        //double calculations are inaccurate
        myWindow.writeOutLine(Math.sin(2.0 * pi));
        myWindow.writeOutLine(Math.abs(-pi));

        myWindow.writeOutLine("");

        i1 = 1; i2 = 2; i3 = 3;

        myWindow.writeOutLine(i1 + i2 * i3);
        myWindow.writeOutLine((i1 + i2) * i3);
    }

    private void equalityRelationalOperators(){
        double d1 = 1.23, d2 = 3.45;
        double delta = 0.00000001;
        String s1 = "dog", s2;

        s2 = myWindow.readIn(); //assume the string dog is input

        myWindow.clearOut();
        //remember floating points are stored inaccurately
        myWindow.writeOutLine("d1 == d2: " + (d1 == d2));   //false, maybe
        myWindow.writeOutLine("d1 != d2: " + (d1 != d2));   //true, maybe
        //inner parentheses essential in the next statement. Why?
        myWindow.writeOutLine("d1 < d2: " + (d1 < d2));     //true, maybe
        myWindow.writeOutLine("d1 <= d1: " + (d1 <= d1));   //true, maybe

        //allowing for floating point inaccuracy
        myWindow.writeOutLine((d2 - d1) < delta);

        myWindow.writeOutLine("s1 == s2: " + (s1 == s2));   //false, huh!!!


    }

    private void equalityRelationalOperators2(){

        String s1 = "dog", s2, s3 = "dOg", s4 = "dogs)";

        s2 = myWindow.readIn(); //the string dog is input

        myWindow.clearOut();
        myWindow.writeOutLine("s1.equals(s2): " + s1.equals(s2));   //hooray!
        myWindow.writeOutLine("!s1.equals(s2): " + !s1.equals(s2)); //
        myWindow.writeOutLine("s1.equals(s3): " + s1.equals(s3));   //case sensitive
        //next statement: true, case insensitive
        myWindow.writeOutLine("s1.equalsIgnoreCase(s3): " + s1.equalsIgnoreCase(s3));

        myWindow.writeOutLine("s1.compareTo(s4): " + s1.compareTo(s4));  // -ve
        myWindow.writeOutLine("s4.compareTo(s1): " + s4.compareTo(s1));  // +ve
        myWindow.writeOutLine("s1.compareTo(s2): " + s1.compareTo(s2));  // 0

        myWindow.writeOutLine("s1.compareTo(s3): " + s1.compareTo(s3));  // +ve
        //next statement: 0 i.e. s1 = s2
        myWindow.writeOutLine("s1.compareToIgnoreCase(s3): " + s1.compareToIgnoreCase(s3));

    }

    private void logicalOperators(){

        int low = 50, high = 100; //inclusive
        int testValue1 = 99, testValue2 = 101;
        boolean firstTest, secondTest;

        myWindow.clearOut();

        firstTest = testValue1 >= low && testValue1 <= high; //in test
        secondTest = testValue1 < low || testValue1 > high; //out test
        myWindow.writeOutLine("testValue1 in range: " + firstTest);
        myWindow.writeOutLine("testValue1 out of range: " + secondTest);

        myWindow.writeOutLine("");
        firstTest = testValue2 >= low && testValue2 <= high; //in test
        secondTest = testValue2 < low || testValue2 > high; //out test
        myWindow.writeOutLine("testValue2 in range: " + firstTest);
        myWindow.writeOutLine("testValue2 out of range: " + secondTest);

        //short circuiting
        int i = 0;
        myWindow.writeOutLine("");
        myWindow.writeOutLine(5 < 3 && (++i > 100));
        myWindow.writeOutLine(i);
    }

    private void redundantSyntax(){
        boolean myBoolean = true;
        boolean result;

        result = myBoolean = true;
        result = myBoolean != true;
    }

    private void blockScopeTest(){
        int outer = 1;

        myWindow.clearOut();

        myWindow.writeOutLine("outer: " + outer);
        //myWindow.writeOutLine("inner1: " + inner1); //inner1 not in scope
        //myWindow.writeOutLine("inner2: " + inner2); //inner2 not in scope
        {
            int inner1 = 2;
            myWindow.writeOutLine("outer: " + outer);
            myWindow.writeOutLine("inner1: " + inner1);
            //myWindow.writeOutLine("inner2: " + inner2); //inner2 not in scope

        }

        {
            int inner2 =3;
            myWindow.writeOutLine("outer: " + outer);
            //myWindow.writeOutLine("inner1: " + inner1); //inner1 not in scope
            myWindow.writeOutLine("inner2: " + inner2);
        }
    }



    // =========================================================================
    // UTILITIES ===============================================================
    // =========================================================================
    private static boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    private static int getRandom(int n1, int n2){
        int retVal = 0;

        retVal = n1 + (int) Math.floor(Math.random() * (n2 - n1 + 1));

        return retVal;
    }

}
