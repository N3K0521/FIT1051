package Week4.Week04_Workshop;
/*
public class workshop4 {
    public static void main(String[] args) {
        if(flag==true && stop==false){
            i=0;
            while(stop==false && i<10){
                for(int j=0;j<i && isLineEmpty==false;j++){
                    line=readSingleLine();
                    isLineEmpty=checkLine(line);
                }
            }
        }
    }
}
*/

//flag == true
//!stop

//answer
/*
public class workshop4 {
    public static void main(String[] args) {
        boolean flag = true;
        boolean stop = false;
        int i;
        if(flag && !stop){
            i = 0;
            while (i<10){
                for(int j=0; j<i && !isLineEmpty; j++){
                    line=readSingleLine();
                    isLineEmpty=checkLine(line);
                }
            }
        }
}
*/
