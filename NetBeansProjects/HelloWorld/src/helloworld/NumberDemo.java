/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author Mingmar Hyolmo
 */
public class NumberDemo {
    public static void main(String[] args) {
        int arr[]={1,56,90,34,56,10,23,56,11,12};
        int max= arr[0];
        for (int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        System.out.println(max);
    }
    
    
    
}
