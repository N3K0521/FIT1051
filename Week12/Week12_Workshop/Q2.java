package Week12_Workshop;

public class Q2 {
    public static int oddsAndEvens(int[] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length; i++) {
            if ((arr[0] % 2 == 0 && arr[i] % 2 == 0) || (arr[0] % 2 != 0 && arr[i] % 2 != 0)) {
                sum += arr[i];
            } else if ((arr[0] % 2 == 0 && arr[i] % 2 != 0) || (arr[0] % 2 != 0 && arr[i] % 2 == 0)) {
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {3,8,7,9};
        System.out.println(oddsAndEvens(arr));
    }
}
