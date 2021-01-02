/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abumansorsort;

/**
 *
 * @author alaa ahmed amer
 */
public class bucketSort {
        
//this used to sort primitive int type with range [0...k],It is best used when the range is small
    static class MyInteger{
        int value;
        int repetition;
        public MyInteger(int value,int repetition){
            this.value=value;
            this.repetition=repetition;
        }
    }
    public static void bucketSort(int[] arr){
        int max=Integer.MIN_VALUE,index=0;
        for (int value : arr) if (value > max) max = value;
        MyInteger[] bucket=new MyInteger[max+1];
        for (int number : arr) {
            if (bucket[number] == null) bucket[number] = new MyInteger(number, 1);
            else bucket[number].repetition++;
        }
        for (MyInteger myInteger : bucket) {
            if (myInteger != null)
                for (int i=0;i<myInteger.repetition;i++) arr[index++] = myInteger.value;
        }
    }
}
