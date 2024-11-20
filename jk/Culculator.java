import java.util.*;
import sun.jvm.hotspot.oops.java_lang_Class;
import java .lang.Math;
import java.io.*;
import jvav.util.Scanner;



public class Culculator {

    /**
     * @param args
     * @ Autour Noria Qasimi
     * @ about a simple Culculator in Math for workshop of 1
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstnumber = scanner.nextInt;
        int secondnumber = scanner.nextInt();
        char op = scanner.next.charAt(0);
        double flooof =0;

        switch(op){
            case'+':
              flooof = firstnumber + secondnumber;
              break;
            case'-':
               flooof = firstnumber - secondnumber;
               break;
            case '*':
               flooof = firstnumber * secondnumber;
               break;
            case '/':;
               if(secondnumber != 0 ){
                flooof = firstnumber / secondnumber;

               }else{
                System.out.println(0);
               }
               break;
               
            default :
               System.out.println("You enter wrong input");  
        }
        System.out.println(firstnumber + " " +op+
        " " + secondnumber + " " + flooof);

    }
}