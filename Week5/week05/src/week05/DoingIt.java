package week05.src.week05;

import java.util.ArrayList;

/**
 * Created by shuxford
 */
public class DoingIt {
    Window myWindow;

    //class level variables here

    public void doIt(Window win){
        myWindow = win;

        //lab1();
        //lab2();
        //lab3();
        //lab4();
        //lab5();

        //valueAndReference();
        //simpleArrays();
        //declaringArraysAndUsingArrayElements();
        //whenArraysContainReferenceTypes();
        //arrayListExample();
        //strings();
        //stringClassExample();
        //demo();
        //demo2();
        //demo3();

    }

    private void demo(){
        myWindow.clearOut();

        //PRIMITIVES AND ARRAYS OF PRIMITIVES ==========================================================================

        //local primitive
        int i;
        //myWindow.writeOutLine(i); //undefined


//        //local array object (so object) reference
//        int[] iA;
//        //myWindow.writeOutLine(iA); //undefined
//
//        //iA = new int[5];
//        //myWindow.writeOutLine(iA);
//        //myWindow.writeOutLine(iA[0]);




        //REFERENCES AND ARRAYS OF REFERENCES===========================================================================

//        //local object reference
//        Person p;
//        //myWindow.writeOutLine(p); //undefined
//
//        p = new Person();
//        myWindow.writeOutLine(p);
//        myWindow.writeOutLine(p.getName());
//        myWindow.writeOutLine(p.getAge());


//        Person[] pA;
//        //myWindow.writeOutLine(pA);
//
//        pA = new Person[5];
//        //myWindow.writeOutLine(pA);
//        //myWindow.writeOutLine(pA[0].getName()); //NullPointerException
//        //myWindow.writeOutLine(pA[0].getAge()); //NullPointerException
//
//        pA[0] = new Person();
//        //myWindow.writeOutLine(pA[0].getName()); //NullPointerException
//        //myWindow.writeOutLine(pA[0].getAge()); //NullPointerException
//
//        pA[0].setName("Test");
//        pA[0].setAge(18);
//        //myWindow.writeOutLine(pA[0].getName()); //NullPointerException
//        //myWindow.writeOutLine(pA[0].getAge()); //NullPointerException

    }

    private void demo3UsingJavaArrayNotArrayListsAndNoLoops(){
        boolean b;
        //ArrayList<String> myList = new ArrayList<String>(100);
        String[] myList = new String[100]; //fixed, not a hint
        int nextElem = 0; //also the current length i.e. current number of elements

        myWindow.clearOut();

//        myList.add("three"); //set() can only replace existing elements not add new elements
//        myList.add("one"); //this type of add (1 parameter) appends to the end of the array
        myList[nextElem] = "three"; nextElem++;
        myList[nextElem] = "one"; nextElem++;

//        myList.add(0, "four");  //this type of add (2 parameters) inserts value 4 at index 0
//                                //which pushes all the following elements up one index
//        myList.add(2, "two");
        myList[2] = myList[1];
        myList[1] = myList[0];
        myList[0] = "four";
        nextElem++;

        myList[3] = myList[2];
        myList[2] = "two";
        nextElem++;

        //myWindow.writeOutLine(myList);  //wow! ArrayLists know how to display themselves
        //this does not work for Java arrays
        myWindow.writeOutLine(javaStringArrayToString(myList, nextElem));

//        myList.set(2, "seven"); //set() can only replace existing elements not add new elements
//        myWindow.writeOutLine(myList);
        myList[2] = "seven";
        myWindow.writeOutLine(javaStringArrayToString(myList, nextElem));

//        myList.remove(0);
        myList[0] = myList[1];
        myList[1] = myList[2];
        myList[2] = myList[3];
        myList[3] = myList[4];
        nextElem--;

//        myWindow.writeOutLine(myList);
        myWindow.writeOutLine(javaStringArrayToString(myList, nextElem));

//        myList.add(myList.size() -1, "five");
//        myList.add(myList.size() -1, "five");
//        myList.add(myList.size() -1, "five");
//        myWindow.writeOutLine(myList);
        myList[nextElem] = myList[nextElem - 1];
        myList[nextElem - 1] = "five";
        nextElem++;

        myList[nextElem] = myList[nextElem - 1];
        myList[nextElem - 1] = "five";
        nextElem++;

        myList[nextElem] = myList[nextElem - 1];
        myList[nextElem - 1] = "five";
        nextElem++;
        myWindow.writeOutLine(javaStringArrayToString(myList, nextElem));

//
//        myWindow.writeOutLine(myList.indexOf("five"));
        myWindow.writeOutLine(linearSearch(myList, nextElem, "five"));
//
//        b = myList.indexOf("five") != -1;
//        myWindow.writeOutLine(b);
//        b = myList.contains("seven");
//        myWindow.writeOutLine(b);

        b = linearSearch(myList, nextElem, "five") != -1;
        myWindow.writeOutLine(b);
    }

    private String javaStringArrayToString(String[] a, int end){
        String retVal = "";
        for(int i = 0; i < end; i++)
            retVal += a[i] + " ";

        return retVal;
    }

    private int linearSearch(String[] a, int end, String searchFor){
        boolean found = false;
        int index, indexToFind = -1;

        index = 0;
        while (!found && index < end){
            if (a[index].equals(searchFor)) {
                found = true;
                indexToFind = index;
            }
            index++;
        }

        return indexToFind;
    }

    //LAB EXERCISES for you to code
    private void lab1(){
        int[] myIntegerArray = {4, 3, 2, 1};
        //a
        int index = myIntegerArray.length-1;
        myWindow.clearOut();
        myWindow.writeOutLine(myIntegerArray[index]);
        //test case where a new array is created
        int[] myIntegerArray2 = {4, 3, 2, 1, 9};
        int index2 = myIntegerArray2.length-1;
        myWindow.writeOutLine(myIntegerArray2[index2]);
        //test case where a new integer is added to the initial array to form a new array
        int[] myIntegerArray3 = new int[myIntegerArray.length+1];
        myIntegerArray3[0] = myIntegerArray[0];
        int index3 = myIntegerArray3.length-1;
        myWindow.writeOutLine(myIntegerArray3[index3]);

        //b
        int a = myIntegerArray[index] * myIntegerArray[--index] * myIntegerArray[--index] * myIntegerArray[--index];
        myWindow.writeOutLine(a);

        //c
        double firstElement = myIntegerArray[0];
        double thirdElement = myIntegerArray[2];
        Boolean isTrue = Math.pow(firstElement,0.5) == thirdElement;
        myWindow.writeOutLine(isTrue);
    }

    private void lab2(){
        String[] myStringArray;
        myStringArray = new String[3];
        myStringArray[0] = "green";
        myWindow.clearOut();
        //Compile error - no array has been instantiated but a variable capable of addressing/referencing
        //                String arrays of any size has been declared but its value is undefined (not null either)
        //Next statement causes a compile error: myStringArray undefined
        //myWindow.writeOutLine(myStringArray.length);

        //NullPointerException error at run-time - An array object of 3 variables of type String
        //has been instantiated. No Strings have been instantiated. These 3 variables have been
        //auto-initialised to null since String is a reference type.
        //myWindow.writeOutLine(myStringArray.setString("green"));

        //ArrayIndexOutOfBoundsException
        //myWindow.writeOutLine(myStringArray[4]);

        //display the length of the first element of myStringArray
        String firstElement = myStringArray[0];
        int StringLength = firstElement.length();
        myWindow.writeOutLine(StringLength);


    }

    private void lab3(){

        //a
        ArrayList<String> myList = new ArrayList<String>(100);

        myWindow.clearOut();
        myList.add("3");
        myList.add("1");

        myList.add("0, 4");
        myList.add("2, 2");

        myWindow.writeOutLine(myList);

        myList.set(2, "7");
        myWindow.writeOutLine(myList);

        myList.remove(0);
        myWindow.writeOutLine(myList);

        myList.add(myList.size()-1, "5");
        myList.add(myList.size()-1, "5");
        myList.add(myList.size()-1, "5");
        myWindow.writeOutLine(myList);

        myWindow.writeOutLine(myList.indexOf("7"));

        //b
        boolean contains = myList.contains("7");
        myWindow.writeOutLine(contains);
    }

    private void lab4(){
        String str = myWindow.readIn();
        myWindow.clearOut();
        //substring(int beginIndex, int endIndex)
        myWindow.writeOutLine(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());

        //test cases
        String test1 = "CAtaStROPhe";
        System.out.println(test1.substring(0, 1).toUpperCase() + test1.substring(1).toLowerCase());

        String test2 = "WelCOMe to FIT1051";
        System.out.println(test2.substring(0, 1).toUpperCase() + test2.substring(1).toLowerCase());

        String test3 = "sFHWSLSkjafls";
        System.out.println(test3.substring(0, 1).toUpperCase() + test3.substring(1).toLowerCase());

    }

    private void lab5(){
        // %4d -> 4 integers
        // \n -> a new line
        myWindow.clearOut();
        myWindow.writeOut(String.format("%7d\n%6d\n%5d\n%4d", 1,10,100,1000));
        System.out.println(String.format("%4d\n%4d\n%4d\n%4d", 1,10,100,1000));
    }


    //WORKSHOP CODE for you to play with
    private void valueAndReference(){
        int int1, int2;

        myWindow.clearOut();

        //VALUE TYPES
        myWindow.writeOutLine(">>>Value Types");
        int1 = 1;
        int2 = 2;
        myWindow.writeOutLine("int1 = " + int1 + " " + ", int2 = " + int2);

        int2 = int1;    //int2 is set with a copy of the value of int1
                        //int1 and int are 2 independent variables that have the same value
        myWindow.writeOutLine("int1 = " + int1 + " " + ", int2 = " + int2);

        int1 = 7; //changing int1 has no effect on int2
        myWindow.writeOutLine("int1 = " + int1 + " " + ", int2 = " + int2);



        //REFERENCE TYPES
        Person p1, p2;

        myWindow.writeOutLine("\n>>>Reference Types");
        p1 = new Person(); //instantiate a person object
        p2 = new Person(); //instantiate another person object
        myWindow.writeOut("p1 name/age = " + p1.getName() + "/" + p1.getAge());
        myWindow.writeOutLine(", p2 name/age = " + p2.getName() + "/" + p2.getAge());

        p1.setName("Alana"); p1.setAge(1);
        p2.setName("Jake"); p2.setAge(2);
        myWindow.writeOut("p1 name/age = " + p1.getName() + "/" + p1.getAge());
        myWindow.writeOutLine(", p2 name/age = " + p2.getName() + "/" + p2.getAge());

        p2 = p1;    //p2 is set with a copy of the value of p1
                    //BUT p1 and p2 are interpreted as memory addresses
        //p2.setName(p1.getName()); p2.setAge(p1.getAge());

        myWindow.writeOut("p1 name/age = " + p1.getName() + "/" + p1.getAge());
        myWindow.writeOutLine(", p2 name/age = " + p2.getName() + "/" + p2.getAge());

        p1.setAge(7); //changing p1 is now the same as changing p2
        p1.setName("Test");
        myWindow.writeOut("p1 name/age = " + p1.getName() + "/" + p1.getAge());
        myWindow.writeOutLine(", p2 name/age = " + p2.getName() + "/" + p2.getAge());
    }

    private void simpleArrays(){
        int[] myIntArray = {11, 22, 33};

        String[] myStringArray = {"clubs", "diamonds", "hearts", "spades" };

    }

    private void declaringArraysAndUsingArrayElements(){
        //local array declarations
        int[] myIntArray;
        String[] myStringArray = new String[5];
        Person[] myPersonArray = new Person[100];

        int numberOfElements;

        myWindow.clearOut();

        //next statement causes a compile error: myIntArray undefined
        //myWindow.writeOutLine(myIntArray.length);

        myIntArray = new int[10];
        numberOfElements = myIntArray.length; //arrays know their length
        myWindow.writeOutLine("myIntArray.length: " + numberOfElements);

        myIntArray[5] = 21; //set an element value
        myWindow.writeOutLine("myIntArray[5]: " + myIntArray[5]); //get an element value

        //myPersonArray[77].setAge(19); //NullPointerException
        Person me = new Person();
        myPersonArray[77] = me; //2 references to the same place in memory
        me.setName("Jillian");
        myPersonArray[77].setAge(31);
        myWindow.writeOutLine("me.getAge(): " + me.getAge());
        myWindow.writeOutLine("myPersonArray[77].getName(): " + myPersonArray[77].getName());
        myWindow.writeOutLine("myIntArray[9]: " + myIntArray[9]); //auto-initialisation of a local
        //myWindow.writeOutLine(myIntArray[10]); //ArrayIndexOutOfBoundsException
    }

    private void whenArraysContainReferenceTypes(){
        String[] myStringArray2;
        myStringArray2 = new String[4];
        myStringArray2[1] = "test";
    }

    private void arrayListExample(){
        ArrayList<Integer> myList = new ArrayList<Integer>(100);

        myWindow.clearOut();
        myList.add(3); //set() can only replace existing elements not add new elements
        myList.add(1); //this type of add (1 parameter) appends to the end of the array

        myList.add(0, 4);   //this type of add (2 parameters) inserts value 4 at index 0
                            //which pushes all the following elements up one index
        myList.add(2, 2);

        myWindow.writeOutLine(myList);  //wow! ArrayLists know how to display themselves
                                        //this does not work for Java arrays
        myList.set(2, 7); //set() can only replace existing elements not add new elements
        myWindow.writeOutLine(myList);

        myList.remove(0);
        myWindow.writeOutLine(myList);

        myList.add(myList.size() -1, 5);
        myList.add(myList.size() -1, 5);
        myList.add(myList.size() -1, 5);
        myWindow.writeOutLine(myList);

        myWindow.writeOutLine(myList.indexOf(7));

    }

    private void strings(){
        //String myString = "Test"; //when we code this

        String myString = new String("Test"); //Java translates it to this

        myString = "one";
        myString = "two";
    }

    private void stringClassExample(){
        String testString = "abcdefghijklmnopqrtsuvwxyz";
        String formatString, insertString;
        myWindow.clearOut();

        myWindow.writeOutLine("Length: " + testString.length());
        myWindow.writeOutLine("starts with abc?: " + testString.startsWith("abc"));
        myWindow.writeOutLine("10th character is j?: " + testString.substring(9, 10).equals("j"));
        myWindow.writeOutLine("4 characters starting at the 5th character are: " +
                testString.substring(3, 7));
        myWindow.writeOutLine("all the character after this are: " + testString.substring(7));

        formatString = "A double truncated to 3 places: %.3f.";
        myWindow.writeOutLine(String.format(formatString, 1.2745));

        formatString = "An int left justified in 10 spaces: %-10d. A double truncated to 1 place: %.1f.";
        myWindow.writeOutLine(String.format(formatString, 77, 1.2345));

        insertString ="***";
        formatString = "Insert a string %s. Escape the placeholder sentinel %%";
        myWindow.writeOutLine(String.format(formatString, insertString, 1.2345));

    }
}
