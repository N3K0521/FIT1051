package Week12_Workshop;

public class Q3 {
    public static double calcSeries(int n){
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= (double) (i * i) / (double) (i * 3);
            }
            else {
                sum += (double) (i * i) / (double) (i * 3);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(calcSeries(n));
    }
}
