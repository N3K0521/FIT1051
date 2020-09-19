package Week07_Workshop;

public class Question1 {
    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        String []ar = {"one", "two", "three", "four", "five"};
        while(count <= 4 && ar[i].length() % 2 != 0) {
            System.out.println(ar[i]);
            count += 1;
            i += 1;
        }
    }
}
