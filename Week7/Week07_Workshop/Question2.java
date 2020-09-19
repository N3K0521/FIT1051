package Week07_Workshop;

public class Question2 {
    public static void main(String[] args) {
        int t = 0;
        int count = 0;
        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8};
        for(int element:ar) {
            if (element % 2 == 0) {
                t = t + element;
                count = count + 1;
            }
        }

        System.out.println(t/count);
    }
}
