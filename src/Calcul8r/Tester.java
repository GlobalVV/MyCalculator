package Calcul8r;

import java.sql.SQLOutput;

public class Tester {
    public static void main(String[] args) {
        Calcul8r.Operations o = new Calcul8r.Operations();
        //OperationsInt o = new Operations();
        if(o.checkEquation("1+2(5-4)")){
            System.out.println("Correct Format");
        }else{
            System.out.println("Incorrect Format");
        }
        o.clearStack();

        if(o.checkEquation("1+2)5-4)")){
            System.out.println("Correct Format");
        }else{
            System.out.println("Incorrect Format");
        }
        o.clearStack();

        if(o.checkEquation("1+2(5-4(7+8))")){
            System.out.println("Correct Format");
        }else{
            System.out.println("Incorrect Format");
        }
        o.clearStack();
        if(o.checkEquation("1+2(5-4(7+8)")){
            System.out.println("Correct Format");
        }else{
            System.out.println("Incorrect Format");
        }







    }


}
