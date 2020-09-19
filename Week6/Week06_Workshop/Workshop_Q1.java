package Week6;

public class Workshop_Q1 {
    public static void main(String[] args) {
        int[] myArray = {5,21,0};
        if (myArray[0] >= myArray[1] && myArray[0] >= myArray[2]) {
            int max = myArray[0];
            System.out.println(max);
        }
            else
                if (myArray[1] >= myArray[0] && myArray[1] >= myArray[2]) {
                    int max = myArray[1];
                    System.out.println(max);
            }
                else
                    if (myArray[2] >= myArray[0] && myArray[2] >= myArray[1]) {
                        int max = myArray[2];
                        System.out.println(max);
        }
    }
}

