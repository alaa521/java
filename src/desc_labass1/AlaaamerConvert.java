/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desc_labass1;

import java.util.Scanner;

/**
 *
 * @author alaa ahmed amer
 */
public class AlaaamerConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inter number to convart ");
        int num=input.nextInt();
        System.out.println("BintoDic = "+BintoDic(num));
        System.out.println("Dictobin = "+Dictobin(num));
        System.out.println("bintohex = "+bintohex(num));
        System.out.println("dectohex = "+dectohex(num));
        System.out.println("inter string to  convart ");
        String n=input.next();
        System.out.println("hextobin = "+hextobin(n));
        System.out.println("hextodoc = "+hextodoc(n));
        System.out.println("alaa ahmed amer 220180251");

    }
    public static int BintoDic(int num){
        int counter=0;
        int result=0;
        while(num!=0){
            int temp=num%10;
            result+=temp*Math.pow(2, counter);
            num=num/10;
            ++counter;
        }
        return result;
    }
    public static String Dictobin(int num){
         String binary="";
         while(num>0){
            binary=(num%2)+binary;
            num=num/2;
         }
         return binary;
     }
    public static String bintohex(int num){
        int rem;
        String hexnum="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
         while(num>0){
           rem=num%16;
           hexnum=hex[rem]+hexnum;
           num=num/16;}
             return hexnum;
}
    public static String hextobin(String num){
        String digit="0123456789ABCDEF";
        String[] binary={"0000","0001","0010","0011","0100","0101","0110","0111",
            "1000","1001","1010","1011","1100","1101","1110","1111"};
        num=num.toUpperCase();
        String var="";
        for(int i=0;i<num.length();i++){
            char c=num.charAt(i);
            var=var+binary[digit.indexOf(c)];
        }
              return var;
          }
    public static String dectohex(int num){
         int rem;
        String hexnum="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
         while(num>0){
           rem=num%16;
           hexnum=hex[rem]+hexnum;
           num=num/16;}
             return hexnum;
}
    public static int hextodoc(String num){
      int val=0;
      num=num.toUpperCase();
      String hex="0123456789ABCDEF";
      for(int i=0;i<num.length();i++){
            char c=num.charAt(i);
           int d=hex.indexOf(c);
           val=val*16+d;
        }
              return val;
          }
    
    }        

