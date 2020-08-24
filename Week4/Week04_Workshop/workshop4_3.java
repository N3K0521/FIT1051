package Week4.Week04_Workshop;

public class workshop4_3 {
    public static void main(String[] args) {
        boolean flag = true, exp1, exp2;
        int x = 10;
        double y = -2.4;
        // = -> assignment 赋值
        // == -> 比较
        exp1=(x>4&&!flag) ||(x==10 &&!(!flag));
        exp2=(y%2==1 && !flag) && (y<0 || (x+y)>5);
        System.out.println(exp1);
        System.out.println(exp2);
    }
}
