/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discreatelab4;

import java.util.Scanner;

/**
 *
 * @author alaa ahmed amer
 */
public class AlaaamerLabwork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         binaryNumbersOparator();}
    public static void binaryNumbersOparator(){
        System.out.println("Alaa Ahmed Amer 220180251.");
        Scanner input=new Scanner(System.in);
        System.out.println("Please! Enter First Binary Number:");
        String Binary_1=input.next();
        System.out.println("Please! Enter Second Binary Number:");
        String Binary_2=input.next();
        int Number_1=Integer.parseInt(Binary_1,2);
        int Number_2=Integer.parseInt(Binary_2,2);
        System.out.println("Enter Type of Operation : +, - , *, /");
        String operation=input.next();
        int result=0;
        int reminder=0;
        switch(operation){
            case "+":
                result=Number_1+Number_2;
                break;
            case "-":
                result=Math.abs(Number_1-Number_2);
                break;
            case "*":
                result=Number_1*Number_2;
                break;
            case "/":
                result=Number_1/Number_2;
                reminder=Number_1%Number_2;
                break;
            default:
                System.out.println("Error");
                break;}
        System.out.println("The Result="+Integer.toBinaryString(result)+ ", int= "+result);
        System.out.println("The reminder="+Integer.toBinaryString(reminder)+ ", int= "+reminder);
    }
    

}
