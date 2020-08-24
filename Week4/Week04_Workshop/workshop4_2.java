package Week4.Week04_Workshop;

public class workshop4_2 {
    public static void main(String[] args) {
        //block a
        int a=10;
        {
            //block b
            int b=20;
            {
                //block c
                int c=30;
                System.out.println(a+","+b+","+c);
            }
            //System.out.println(a+","+b+","+c);
        }
        //System.out.println(a+","+b+","+c);
    }
}
