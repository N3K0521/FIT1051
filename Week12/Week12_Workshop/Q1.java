package Week12_Workshop;

public class Q1 {
    public static int checkArrays(int[] arr1, int[] arr2) {
        int count = 0;
        int num1 = arr1.length - 1;
        int num2 = arr2.length - 1;
        while (num1 >= 0 && num2 >= 0){
            if (arr1[num1] == arr2[num2]){
                count += 1;
                num1 -= 1;
                num2 -= 1;
            }
            else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[]array1 = {1, 3, 5, 7};
        int[]array2 = {1, 3, 6, 7};
        System.out.println(checkArrays(array1, array2));
    }
}
