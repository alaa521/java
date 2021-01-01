/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desc_labass1;

/**
 *
 * @author alaa ahmed amer
 */
public class AlaaAhmedAmer220180251 {
    public static final boolean[][] cases={{false,false},{false,true},{true,false},{true,true}};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Alaa Ahmed Amer 220180251");
        Invtable();
        ORtable();
        IMPLECATIONtable();
         Biocondittionaltable();
         System.out.println("=====================");}
    public static void Invtable(){
        System.out.println("======================");
         System.out.printf( "%13s \n","INV table" );
        System.out.printf( "%-8s  %-11s \n","p","-p");
             for(boolean[]bcase:cases){
            System.out.printf("%-8s %-11s\n",bcase[0],!bcase[0]); }
}
     public static void ORtable(){
        System.out.println("======================");
        System.out.printf( "%13s \n","or table" );
        System.out.printf( "%-8s %-8s %-11s \n","p","q","p v q");
        for(boolean[]bcase:cases){
            System.out.printf("%-8s %-8s %-11s\n",bcase[0],bcase[1],bcase[0]||bcase[1]);
        }
}
     public static void IMPLECATIONtable(){
        System.out.println("======================");
        System.out.printf( "%13s \n","IMPLECATION table" );
        System.out.printf( "%-8s %-8s %-11s \n","p","q",("p -> q"));
        for(boolean[]bcase:cases){
            System.out.printf("%-8s%-8s%-11s\n",bcase[0],bcase[1],(!bcase[0]||bcase[1]));
        }
}
     public static void Biocondittionaltable(){
        System.out.println("======================");
        System.out.printf( "%13s\n","Biocondittional table" );
        System.out.printf( "%-8s %-8s %-11s\n","p","q","p<--> q");
        for(boolean[]bcase:cases){
            System.out.printf("%-8s %-8s %-11s\n",bcase[0],bcase[1],(!bcase[0]||bcase[1])&&(!bcase[1]||bcase[0]));
        }
         System.out.println("alaa amer 220180251");
}
}
