package Week08_Workshop;

import java.util.ArrayList;

public class Q2 {
    public static ArrayList<Integer> diffArList(ArrayList<Integer> arL1, ArrayList<Integer> arL2) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>(10);
        for (int i = 0; i < arL1.toArray().length; i++) {
            boolean flag = false;
            for (int j = 0; j < arL2.toArray().length; j++) {
                if (arL1.get(i) == arL2.get(j) && flag == false){
                    arraylist.add(arL1.get(i));
                    flag = true;
                }
            }
        }
        return arraylist;
    }

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        System.out.println("arL1 = "+l1);

        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(3);
        l2.add(4);
        l2.add(6);
        l2.add(7);
        System.out.println("arL2 = "+l2);

        ArrayList<Integer> res = diffArList(l1,l2);
        System.out.println("Return: "+res);
        //Output: [3,4]
    }
}
