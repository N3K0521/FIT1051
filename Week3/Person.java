package Week3;

public class Person {
    private int age; //variable stores as a block in the memory; 4 bytes
    private String name;
    private boolean flag;
    private double fees; //8 bytes -> 64 bits
    int k1_4_something; //can't start with a number or having spaces

    public void setFees(double newFees) {
        fees = newFees;
    }

/*
    public void calculateFees() {

        int i = 10;
        /*
        i=i+1;
        i=i-1;

        i++;//increase i by 1
        i--;
        ++i;
        --i;

        int result;
        result = ++i + 5;

        System.out.println(result);
        System.out.println(i);

    }
*/

    /*
    public static void main(String[] args){
        int i;
        int j;
        i=20;
        j=i;
        name="abc";
        name="xyz";

        int k; //declare
        k=2; //assign k a value
        int result;
        result=k*3;
    }
    */
    public static void main(String[] args) {
        int i = 10;

        int result = ++i + 5;

        System.out.println(result);
        System.out.println(i);
    }
}
/*
    }
    public static void main(String[] args) {
        int i;
        double j;
        int age;

    }

    public double getFees() {
        return fees;
    }
}
*/