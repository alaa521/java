/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abumansorsort;

import java.util.Arrays;

/**
 *
 * @author alaa ahmed amer
 */
public class selectionSort {
    
  
    public static void main(String[] args){
   
    // TODO code application logic here
        int[] a={7,3,2,5};
        for(int i=0;i<=a.length-2;i++){
            int min=i;
            for(int j=i+1;j<=a.length-1;j++)
                if(a[j]<a[min])
                    min=j;
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
        System.out.println(Arrays.toString(a));
}}
