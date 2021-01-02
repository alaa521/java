/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discreatelab4;



/**
 *
 * @author alaa ahmed amer
 */
public class alaaAmer220180251 {
    public static void main(String[] args) {
        System.out.println("Alaa Ahmed Amer 220180251.");
        int a=12,b=24;
        System.out.println("GCD by prime of      : "+a+" and "+b+" is "+primeGCD(a,b));
        System.out.println("GCD by modulus of    : "+a+" and "+b+" is "+modulusGCD(a,b));
        System.out.println("GCD by Eculid of     : "+a+" and "+b+" is "+EculidGcd(a,b));
        System.out.println("GCD by lcm of        : "+a+" and "+b+" is "+lcm(a,b));}
    public static int modulusGCD(int a, int b){ 
        int min=Math.min(a,b); 
        if (a%min==0&&b%min==0) 
            return min; 
         for (int i=min/2;i>=2;i--){
            if (a%i==0&&b%i==0) 
            return i; } 
        return 1;  }
    public static int primeGCD(int a, int b){
        if (a == 0)
          return b;
        if (b == 0)
          return a;
        if (a == b)
            return a;
        if (a > b)
            return primeGCD(a-b, b);
        return primeGCD(a, b-a);
    }
    static int EculidGcd(int a, int b) {
        if (b == 0)   
         return a;
       return    EculidGcd(b, a % b);   }
      public static int lcm(int a,int b){
          int max,lcm=0,s=0;
          if(a>b){
              max=a;}
          else{
              max=b;}
      while(a!=0){
          if(max% a==0&&max%b==0){
              lcm=max;
              break;}
          max+=s;}
    return lcm;}
}
