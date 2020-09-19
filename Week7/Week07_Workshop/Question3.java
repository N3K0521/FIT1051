package Week07_Workshop;

public class Question3 {
    public static void main(String[] args) {
        int []ar = {2, 5, 2, 7, 8, 1};
        int i=0;
        int j=i+1;
        int t;
        while(i<ar.length-1){
            t = ar[i];
            ar[i]=ar[j];
            ar[j]=t;
            j+=2;
            i+=2;
        }
    }
}
