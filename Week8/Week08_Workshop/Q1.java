package Week08_Workshop;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        //Declaring an array
        double[] test1 = {1.5, 0.0, 4.0, 0.0, 3.5, -1.0, 7.0, 8.5, 0.5};
        System.out.println("Input:"+ Arrays.toString(test1));
        //Calling the method
        AveragePosOdd(test1);
        //Output: 4.0

        //Declaring an array with no positive odd element
        double[] test2 = {2.0, 0.0, 4.0, 0.0, 4.0, -1.0, 8.0, 10.0, 0.5};
        System.out.println("Input:"+Arrays.toString(test2));
        //Calling the method
        AveragePosOdd(test2);
        //Output: ERROR
    }

    public static void AveragePosOdd(double[] doubleArray) {
        double total = 0;
        int count = 0;
        int[] intArray = new int[doubleArray.length];
        for (int i = 0; i < doubleArray.length; i++) {
            intArray[i] = (int)doubleArray[i];
        }
        for (int index = 0; index < intArray.length; index ++) {
            if (((intArray[index] % 2) != 0) && intArray[index] > 0) {
                total += doubleArray[index];
                count ++;
            }
        }
        if (count == 0) {
            System.out.println("Output: ERROR");
        }
        else {
            double average = total / count;
            System.out.println("Output: " + average);
        }
    }
}
