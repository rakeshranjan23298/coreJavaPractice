package dsa;

import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter maximum size of array -");
        int max_size = sc.nextInt();
        int arr1[] =new int[max_size];
        
        
        try {
            for (int i = 0; i < max_size; i++) 
            {
                arr1[i] = sc.nextInt();
            }
            
        } catch (Exception e) 
        {
            System.out.println("exception ="+e);
        }
        
        // find largest in unsorted 
        int largest=0;
        for(int j=0;j<arr1.length;j++)
        {
            for(int i=1;i<arr1.length;i++)
            {
                if(arr1[j]<arr1[i])
                {
                    arr1[j]=arr1[i];
                }
            }
        }
        
        for(int k:arr1)
        {
            System.out.println("final array is"+k);
        }
        System.out.println("largest element in array is ="+largest);
        
        
        
        
    }
    
  
}
//How do you find the missing number in a given integer array of 1 to 100?
