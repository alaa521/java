/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaaahmedamer_ass7_1;

import java.util.Scanner;

/**
 *
 * @author alaaa
 */
public class AlaaAhmedAmer_Ass7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int[]list=new int[100];
        String[]names=new String[100];
        int actualsize=0;
        int choice;
        do{
            printMenu();
            choice=input.nextInt();
            
            switch(choice){
                
                
                case 1:
                  actualsize= addRecord( names,list,actualsize);
                break;
                
                case 2:

                    System.out.println("Enter phoneNumber to search for: ");
                int num=input.nextInt();
                
                  int phone=search(list,num);
                if(phone==-1)
                     System.out.println("The phone number is not found");

                else
                    System.out.println("The name is  "+"phone number "+ list[phone]+ "found at index "+phone);

                break;
                
                
                case 3:
                    actualsize= deleteRecord( names,list,actualsize);
                
                break;
                 case 4:
                    printAll(names,list,actualsize);
                break;
                
                
                 case 5:System.out.println("thank you for using our program ");
                break;
                 default:System.out.println("invalid input");
                
            }
        
            
        }while(choice!=5);
    }
   
    public static int search(int[] list, int key){
        for(int i=0;i<list.length;i++){
            if(key==list[i])
                return i;
        }
    
        return -1;
    }
    public static int addRecord(String[] names, int[] phones,int currentSize){
        Scanner input=new Scanner(System.in);
        System.out.println("enter number ");
          int phone=input.nextInt();
          System.out.println("enter names : ");
          String name=input.next();
          int y=search(phones,phone);
          
           if(y==-1){
               phones[currentSize]=phone;
               names[currentSize]=name;
                 currentSize++;
               System.out.println("The record "+ name +"was successfully saved");
           }
           
                  else
                System.out.println("The phone number"+ phone +"is already exist in the phonebook");
         
                
               
        return currentSize;
   
        
    }
   
    public static int deleteRecord(String[] names, int[] phones,int currentSize){
          Scanner input=new Scanner(System.in);
           System.out.println("enter number ");
           int phone=input.nextInt();
             int y=search(phones,phone);
           if(y!=-1){
               for(int i=y,j=y;i<currentSize&&j<currentSize;i++,j++){
               phones[i]=phones[i+1];
                names[j]= names[j+1];
               }
                 currentSize--;
               
               System.out.println("The record\t "+ phone  +"was successfully deleted");
               } 
           
                  else
                System.out.println("The phone number"+ phone +"is not found");
         
                
               
        return currentSize;
               
           }
        
    
    public static void printAll(String[] names,int[] phones,int currentSize){
        for(int i=0;i<currentSize;i++){
            System.out.println(names[i]+"  "+phones[i]);
           
        }
    }
    public static void printMenu(){
        System.out.println("Welcome to myPhoneBook Program ");
        System.out.println("please enter your choice according to the following menu:");
        System.out.println(" [1] Add a record");
        System.out.println("[2] find a record ");
        System.out.println("[3] delete a record");
        System.out.println("[4] display All");
        System.out.println("[5] Quit");
        System.out.println("Your choice is :");
  }
}
